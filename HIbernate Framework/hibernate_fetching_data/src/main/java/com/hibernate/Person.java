package com.hibernate;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Person_Fatch")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @OneToMany(mappedBy = "person",fetch = FetchType.EAGER)
    private List<Address> address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public Person(int id, String name, List<Address> address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Person() {
    }

    
    
}
