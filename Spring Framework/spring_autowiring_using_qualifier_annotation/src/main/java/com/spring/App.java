package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Program started.............." );
        ApplicationContext context =new ClassPathXmlApplicationContext("config.xml");
        Student student =context.getBean("stu1",Student.class);
        System.out.println(student);

    }
}
