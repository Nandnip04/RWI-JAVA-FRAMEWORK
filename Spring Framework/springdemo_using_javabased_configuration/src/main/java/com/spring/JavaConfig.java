package com.spring;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean(name="empDetails")
    public Employee empDetails(){
        Address address=new Address(450661,"madhya pradesh","pandhana");

        Employee emp=new Employee();
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter id of Student :");
        int id=sc.nextInt();

        System.out.println("Enter name of the student :");
        String name=sc.next();

        System.out.println("Enter the salary of the Student :");
        double salary=sc.nextDouble();

        emp.setId(id);
        emp.setName(name);
        emp.setSalary(salary);
        emp.setAddress(address);

        return emp;

    }
}
