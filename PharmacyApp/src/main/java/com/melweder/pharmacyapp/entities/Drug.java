package com.melweder.pharmacyapp.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Leki")
public class Drug extends PrimaryKeyEntity{

    public Drug(){}

    public Drug(String name, boolean onPrescription, DrugsManufacturer manufacturer, Stock stock, List<DrugSale> drugSale){
        this.name = name;
        this.onPrescription = onPrescription;
        this.manufacturer = manufacturer;
        this.stock = stock;
        this.drugSale = drugSale;
    }

    @Column(name = "Nazwa")
    private String name;

    @Column(name = "Na recepte")
    private boolean onPrescription;

    @ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "idProducenta")
    private DrugsManufacturer manufacturer;

    @OneToOne(mappedBy = "drug", cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE })
    private Stock stock;

    @OneToMany(mappedBy = "drug",cascade = { CascadeType.PERSIST, CascadeType.MERGE})
    private List<DrugSale> drugSale = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOnPrescription() {
        return onPrescription;
    }

    public void setOnPrescription(boolean onPrescription) {
        this.onPrescription = onPrescription;
    }

    public DrugsManufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(DrugsManufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public List<DrugSale> getDrugSale() {
        return drugSale;
    }

    public void setDrugSale(List<DrugSale> drugSale) {
        this.drugSale = drugSale;
    }
}
