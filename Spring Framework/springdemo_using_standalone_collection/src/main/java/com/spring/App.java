package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "program started..............." );
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        Student student1=context.getBean("stu1",Student.class);
        System.out.println(student1);
        System.out.println(student1.getFriend().getClass().getName());
        System.out.println("-----------------------------------------------------");
        System.out.println(student1.getFriend());
        System.out.println(student1.getFriend().getClass().getName());
        System.out.println("-----------------------------------------------------");
        System.out.println(student1.getMobielNumber());
        System.out.println(student1.getMobielNumber().getClass().getName());
        System.out.println("-----------------------------------------------------");
        System.out.println(student1.getCources());
        System.out.println(student1.getCources().getClass().getName());
        System.out.println("-----------------------------------------------------");
        System.out.println(student1.getQualification());
        System.out.println(student1.getQualification().getClass().getName());
        System.out.println("program ended........");
    }
}
