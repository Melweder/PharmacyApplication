package com.melweder.pharmacyapp.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Pracownicy")
public class Employee extends Person{

    @Column(name = "Stanowisko")
    private String position;

    @Column(name = "Wynagrodzenie")
    private double salary;

    @OneToMany(mappedBy = "employee", cascade = { CascadeType.PERSIST, CascadeType.MERGE})
    private List<Transaction> transactions = new ArrayList<>();

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }
}
