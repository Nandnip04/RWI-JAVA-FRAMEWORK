package com.hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String categories;

    private Dog dog;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }
    
    
    public Dog getDog() {
        return dog;
    }
    
    public void setDog(Dog dog) {
        this.dog = dog;
    }
    
    public Animal() {
        super();
    }

    public Animal(int id, String categories, Dog dog) {
        this.id = id;
        this.categories = categories;
        this.dog = dog;
    }

    

    
}
