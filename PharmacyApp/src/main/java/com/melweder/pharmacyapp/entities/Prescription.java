package com.melweder.pharmacyapp.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Recepty")
public class Prescription extends PrimaryKeyEntity {

    @Column(name = "Data realizacji")
    @Temporal(TemporalType.DATE)
    private Date date;

    @ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "idLekarza")
    private Doctor doctor;

    @ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "idPacjenta")
    private Patient patient;

    @OneToMany(mappedBy = "prescription", cascade = { CascadeType.PERSIST, CascadeType.MERGE})
    private List<DrugSale> drugSales = new ArrayList<>();

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public List<DrugSale> getDrugSales() {
        return drugSales;
    }

    public void setDrugSales(List<DrugSale> drugSales) {
        this.drugSales = drugSales;
    }
}
