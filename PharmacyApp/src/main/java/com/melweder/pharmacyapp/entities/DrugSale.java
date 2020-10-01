package com.melweder.pharmacyapp.entities;

import javax.persistence.*;

@Entity
@Table(name = "Sprzedaz leku")
public class DrugSale extends PrimaryKeyEntity {

    public DrugSale(){}

    public DrugSale(double price, int amount, Prescription prescription, Transaction transaction, Drug drug){
        this.price = price;
        this.amount = amount;
        this.prescription = prescription;
        this.transaction = transaction;
        this.drug = drug;
    }

    @Column(name = "Cena sprzedazy")
    private double price;

    @Column(name = "Ilosc")
    private int amount;

    @ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "idRecepty")
    private Prescription prescription;

    @ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "idTransakcji", nullable = false)
    private Transaction transaction;

    @ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    @JoinColumn(name = "idLeku", nullable = false)
    private Drug drug;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Prescription getPrescription() {
        return prescription;
    }

    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    public Drug getDrug() {
        return drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
    }
}
