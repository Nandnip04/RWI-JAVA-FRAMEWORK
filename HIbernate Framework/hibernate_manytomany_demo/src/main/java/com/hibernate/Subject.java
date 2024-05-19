package com.hibernate;

import java.util.List;

import javax.persistence.*;

@Entity
public class Subject {

    @Id
    @Column(name="Subject_Code")
    private int scode;

    @Column(name="Subject_Name")
    private String name;

    @ManyToMany
    private List<Student> student;
    public int getScode() {
        return scode;
    }
    public void setScode(int scode) {
        this.scode = scode;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Student> getStudent() {
        return student;
    }
    public void setStudent(List<Student> student) {
        this.student = student;
    }
    public Subject(int scode, String name, List<Student> student) {
        this.scode = scode;
        this.name = name;
        this.student = student;
    }
    public Subject() {
    }

}
