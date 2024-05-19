package com.hibernate;

import javax.persistence.*;

@Entity
public class Account {

    @Id
    @Column(name="Account_id")
    private int aid;

    @Column(name="Account_holder_Name")
    private String name;

    @Column(name="Acoount_number")
    private String number;

    @ManyToOne
    private Bank bank;

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public Account(int aid, String name, String number, Bank bank) {
        this.aid = aid;
        this.name = name;
        this.number = number;
        this.bank = bank;
    }

    public Account() {
    }
}
