package com.melweder.pharmacyapp.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Producenci lekow")
public class DrugsManufacturer extends PrimaryKeyEntity{

    public DrugsManufacturer(){}

    public DrugsManufacturer(String name, List<Drug> drugs){
        this.name = name;
        this.drugs = drugs;
    }

    @Column(name = "Nazwa producenta")
    private String name;

    @OneToMany(mappedBy = "manufacturer", cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE })
    private List<Drug> drugs = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Drug> getDrugs() {
        return drugs;
    }

    public void setDrugs(List<Drug> drugs) {
        this.drugs = drugs;
    }
}
