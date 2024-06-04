package com.spring;
public class Certificate {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Certificate(String name) {
        this.name = name;
    }

    public Certificate() {
    }

    @Override
    public String toString() {
        return "Certificate [name=" + name + "]";
    }
    
    
}
