package com.melweder.pharmacyapp.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Lekarze")
public class Doctor extends Person {

    public Doctor(){}

    public Doctor(String address, String name, String surname, int phoneNumber, char sex, List<Prescription> prescriptions){
        super(address, name, surname, phoneNumber, sex);
        this.prescriptions = prescriptions;
    }

    @OneToMany(mappedBy = "doctor", cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE })
    private List<Prescription> prescriptions = new ArrayList<>();

    public List<Prescription> getPrescriptions() {
        return prescriptions;
    }

    public void setPrescriptions(List<Prescription> prescriptions) {
        this.prescriptions = prescriptions;
    }

}
