package com.spring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
    @Autowired
    @Qualifier("certi1")
    private Certificate certificate;
    private int id;
    private String name;

    
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
    public Certificate getCertificate() {
        return certificate;
    }
    public void setCertificate(Certificate certificate) {
        this.certificate = certificate;
    }
    public Student(int id, String name, Certificate certificate) {
        this.id = id;
        this.name = name;
        this.certificate = certificate;
    }
    public Student() {
    }
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", certificate=" + certificate + "]";
    }

}
