package com.springjdbc;
import java.util.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.*;

import com.springjdbc.daoimpl.EmployeeDaoImpl;
import com.springjdbc.entity.Employee;
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Program started............" );
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        EmployeeDaoImpl dao=context.getBean("employeeDao",EmployeeDaoImpl.class);
        
        
        //insert data 
        /*Employee emp1=new Employee();
        emp1.setId(12);
        emp1.setName("Nidhi");
        emp1.setSalary(50000);
        emp1.setAddress("Burhanpur");
        
        int result=dao.insert(emp1);
        System.out.println("Employee inserted :"+result);*/
        
        
        //fatch one employee data 
        Employee emp=dao.getEmployee(12);
        System.out.println(emp);
     
        System.out.println("----------------------------------------");
        //fatch all employee data 
        List<Employee> employee=dao.getAllEmployees();
        for(Employee e1:employee) {
        	System.out.println(e1);
        }
        System.out.println("----------------------------------------");
        
        System.out.println("Program ended ................");
        
    }
}
