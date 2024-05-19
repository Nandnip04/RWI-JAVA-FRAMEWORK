package com.hibernate;

import javax.persistence.*;

@Entity

public class Developer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Developer_Id")
    private int id;

    private String name;
    private String work;


    @OneToOne
    @JoinColumn(name="Developer_has_Laptop")
    private Laptop laptop;
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
    public String getWork() {
        return work;
    }
    public void setWork(String work) {
        this.work = work;
    }
    public Laptop getLaptop() {
        return laptop;
    }
    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }
    public Developer(int id, String name, String work, Laptop laptop) {
        this.id = id;
        this.name = name;
        this.work = work;
        this.laptop = laptop;
    }
    public Developer() {
    }

}
