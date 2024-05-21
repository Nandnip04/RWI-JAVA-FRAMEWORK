package com.spring;

public class Student {

    private int id;
    private String name;
    private String subject;
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
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public Student(int id, String name, String subject) {
        this.id = id;
        this.name = name;
        this.subject = subject;
    }
    public Student() {
    }
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", subject=" + subject + "]";
    }

    
}
