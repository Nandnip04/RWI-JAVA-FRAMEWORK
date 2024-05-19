package com.hibernate;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Student_Many")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Student_Id")
    private int id;

    @Column(name="Student_Name")
    private String name;

    @Column(name="Student_Roll")
    private String roll;

    @ManyToMany
    @JoinTable(name="Student_Subject_Details")
    private List<Subject> subject;

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

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public List<Subject> getSubject() {
        return subject;
    }

    public void setSubject(List<Subject> subject) {
        this.subject = subject;
    }

    public Student(int id, String name, String roll, List<Subject> subject) {
        this.id = id;
        this.name = name;
        this.roll = roll;
        this.subject = subject;
    }

    public Student() {
    }

}
