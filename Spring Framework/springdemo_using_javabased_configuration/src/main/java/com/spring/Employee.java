package com.spring;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private Address address;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Employee(int id, String name, double salary, Address address) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}
	public Employee() {
	}

    public void display(){
        System.out.println("Id :"+id);
        System.out.println("Name :"+name);
        System.out.println("Salary : "+salary);
        System.out.println("Address : "+address);
    }
}
