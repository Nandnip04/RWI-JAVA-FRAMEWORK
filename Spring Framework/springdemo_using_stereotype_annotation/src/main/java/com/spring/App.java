package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "program started.............." );
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        Employee emp=context.getBean("emp1",Employee.class);
        System.out.println(emp);
    }
}
