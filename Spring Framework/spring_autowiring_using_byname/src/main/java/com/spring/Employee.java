package com.spring;

public class Employee {
    private int id;
    private String name;
    private String mobileNumber;
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
    public String getMobileNumber() {
        return mobileNumber;
    }
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public Employee(int id, String name, String mobileNumber, Address address) {
        this.id = id;
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.address = address;
    }
    public Employee() {
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", mobileNumber=" + mobileNumber + ", address=" + address
                + "]";
    }

    

    
}
