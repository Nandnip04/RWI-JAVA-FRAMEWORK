package com.hibernate;

import javax.persistence.*;

@Embeddable
public class Dog {

    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Dog(String name) {
        this.name = name;
    }
    public Dog() {
        super();
    }
}
