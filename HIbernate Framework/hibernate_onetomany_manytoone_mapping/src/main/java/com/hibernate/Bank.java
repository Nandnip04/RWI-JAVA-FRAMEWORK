package com.hibernate;

import java.util.List;

import javax.persistence.*;

@Entity
public class Bank {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Bank_id")
    private int bid;

    @Column(name="Bank_name")
    private String name;

    @OneToMany
    @JoinColumn(name="bank_has_many_account")
    @JoinTable(name="Bank_Account")
    private List <Account> account;

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Account> getAccount() {
        return account;
    }
    
    public void setAccount(List<Account> account) {
        this.account = account;
    }
    
    public Bank(int bid, String name, List<Account> account) {
        this.bid = bid;
        this.name = name;
        this.account = account;
    }

    public Bank() {
    }
}
