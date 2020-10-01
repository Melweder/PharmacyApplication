package com.melweder.pharmacyapp.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Pacjenci")
public class Patient extends Person {

    public Patient(){}

    public Patient(String address, String name, String surname, int phoneNumber, char sex, List<Transaction> transaction, List<Prescription> prescriptions){
        super(address, name, surname, phoneNumber, sex);
        this.transactions = transaction;
        this.prescriptions = prescriptions;
    }

    @OneToMany(mappedBy = "patient", cascade = { CascadeType.PERSIST, CascadeType.MERGE})
    private List<Transaction> transactions = new ArrayList<>();

    @OneToMany(mappedBy = "patient", cascade = { CascadeType.PERSIST, CascadeType.MERGE})
    private List<Prescription> prescriptions = new ArrayList<>();

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public List<Prescription> getPrescriptions() {
        return prescriptions;
    }

    public void setPrescriptions(List<Prescription> prescriptions) {
        this.prescriptions = prescriptions;
    }
}
