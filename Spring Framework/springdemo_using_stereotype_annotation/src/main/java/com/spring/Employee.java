package com.spring;
import java.util.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("emp1")
public class Employee {

    @Value("05")
    private int id;

    @Value("Nandni")
    private String name;

    @Value("Pandhana")
    private String city;

    @Value("#{address1}")
    private Set<String> address;
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
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public Set<String> getAddress() {
        return address;
        }
        public void setAddress(Set<String> address) {
            this.address = address;
            }
     public Employee(int id, String name, String city, Set<String> address) {
             this.id = id;
             this.name = name;
             this.city = city;
             this.address = address;
            }
     public Employee() {
     }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", address=" + address + "]";
    }
  
     
    
}
