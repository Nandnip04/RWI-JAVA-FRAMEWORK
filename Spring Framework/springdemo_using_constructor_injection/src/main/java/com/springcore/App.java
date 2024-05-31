package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context =new ClassPathXmlApplicationContext("config.xml") ;
        StudentData s1=context.getBean("stu1",StudentData.class);
        s1.print();

        System.out.println("-------------------------------------------------");
        StudentData s2=context.getBean("stu2",StudentData.class);
        s2.print();
    }
}
