package com.springjdbc;
import org.springframework.context.*;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springjdbc.dao.EmployeeDAo;
import com.springjdbc.daoimpl.EmployeeDaoImpl;
import com.springjdbc.entity.Employee;
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Program started..........." );
        ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfigurationFile.class);
        EmployeeDaoImpl emp=context.getBean("employeeDao",EmployeeDaoImpl.class);
        
        //insert data
        /*Employee employee =new Employee();
        employee.setId(121);
        employee.setName("Priti");
        employee.setSalary(45000);
        employee.setAddress("Pune");
        
        int result=emp.insert(employee);
        System.out.println("Data inserted :"+result);*/
        
        
        //delete data 
        /*int result=emp.delete(33);
        System.out.println("Data deleted :"+result);*/
        
        //update data
        Employee employee1 =new Employee();
        employee1.setId(33);
        employee1.setName("Priya");
        employee1.setSalary(45000);
        employee1.setAddress("Indore");
        
        int result1=emp.update(employee1);
        System.out.println("Data updated:"+result1);
        
        
        System.out.println("Program ended");
        
    }
}
