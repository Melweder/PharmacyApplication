package com.melweder.pharmacyapp.entities;

import javax.persistence.*;

@Entity
@Table(name = "Stany magazynowe")
public class Stock {

    @Id
    private int id;

    @Column(name = "Cena hurtowa")
    private double quantityPrize;

    @Column(name = "W zamowieniu")
    private int inOrderAmount;

    @Column(name = "Na stanie")
    private int onStockAmount;

    @OneToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    @JoinColumn(name = "idLeku")
    @MapsId
    private Drug drug;

    public Drug getDrug() {
        return drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getQuantityPrize() {
        return quantityPrize;
    }

    public void setQuantityPrize(double quantityPrize) {
        this.quantityPrize = quantityPrize;
    }

    public int getInOrderAmount() {
        return inOrderAmount;
    }

    public void setInOrderAmount(int inOrderAmount) {
        this.inOrderAmount = inOrderAmount;
    }

    public int getOnStockAmount() {
        return onStockAmount;
    }

    public void setOnStockAmount(int onStockAmount) {
        this.onStockAmount = onStockAmount;
    }
}
