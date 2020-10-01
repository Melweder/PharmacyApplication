package com.melweder.pharmacyapp.entities;

import javax.persistence.*;

@MappedSuperclass
public abstract class PrimaryKeyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
