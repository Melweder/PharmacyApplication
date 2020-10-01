package com.melweder.pharmacyapp.entities;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Person extends PrimaryKeyEntity {

    public Person(){}

    public Person(String address, String name, String surname, int phoneNumber, char sex){
        this.address = address;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.surname = surname;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "address='" + address + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", sex=" + sex +
                '}';
    }

    @Column(name = "Adres")
    private String address;

    @Column(name = "Imie")
    private String name;

    @Column(name = "nazwisko")
    private String surname;

    @Column(name = "Telefon")
    private int phoneNumber;

    @Column(name = "Plec")
    private char sex;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}
