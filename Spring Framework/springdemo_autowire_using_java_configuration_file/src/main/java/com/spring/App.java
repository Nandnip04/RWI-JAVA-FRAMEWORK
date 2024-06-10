package com.spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Program started..........." );
        ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfigurationFile.class);
        Employee emp=context.getBean("getEmployeeData",Employee.class);
        System.out.println(emp);
    }
}
