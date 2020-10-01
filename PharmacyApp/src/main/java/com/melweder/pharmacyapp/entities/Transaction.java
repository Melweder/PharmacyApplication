package com.melweder.pharmacyapp.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Transakcja")
public class Transaction extends PrimaryKeyEntity {

    @Column(name = "Utarg")
    private double revenue;

    @Column(name = "Data transakcji")
    @Temporal(TemporalType.DATE)
    private Date date;

    @ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "idPacjenta")
    private Patient patient;

    @ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "idPracownika")
    private Employee employee;

    @OneToMany(mappedBy = "transaction", cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private List<DrugSale> drugSales = new ArrayList<>();


    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public List<DrugSale> getDrugSales() {
        return drugSales;
    }

    public void setDrugSales(List<DrugSale> drugSales) {
        this.drugSales = drugSales;
    }
}
