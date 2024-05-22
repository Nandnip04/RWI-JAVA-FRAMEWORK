package com.hibernate;

import javax.persistence.*;

@Entity
@Table(name="Address_Fatch")
public class Address {

    @Id
    private int aid;
    private String street;
    private String city;

    @ManyToOne
    private Person person;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Address(int aid,String street, String city, Person person) {
        this.aid=aid;
        this.street = street;
        this.city = city;
        this.person = person;
    }

    public Address() {
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    
}
