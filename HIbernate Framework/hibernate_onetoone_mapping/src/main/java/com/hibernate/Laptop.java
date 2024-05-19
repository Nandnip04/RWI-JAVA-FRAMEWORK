package com.hibernate;

import javax.persistence.*;

@Entity
public class Laptop {
    @Id
    @Column(name="laptop_id")
    private int lpId;

    @Column(name="Company_name")
    private String cname;

    public int getLpId() {
        return lpId;
    }

    public void setLpId(int lpId) {
        this.lpId = lpId;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Laptop(int lpId, String cname) {
        this.lpId = lpId;
        this.cname = cname;
    }

    public Laptop() {
    }

    
}
