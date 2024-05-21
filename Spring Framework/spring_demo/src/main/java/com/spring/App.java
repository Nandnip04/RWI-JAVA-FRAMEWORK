package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");

        Student s1=context.getBean("stu1",Student.class);
        System.out.println(s1);

        Student s2=context.getBean("stu2",Student.class);
        System.out.println(s2);
    }
}
