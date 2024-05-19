package com.hibernate;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "data loading .............." );

        //Configuration
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");

        //sessionfactory
        SessionFactory factory =cfg.buildSessionFactory();

        //session
        Session session =factory.openSession();

        //Transaction
        Transaction tl=session.beginTransaction();

        //creating object Student objects
        Student stu1=new Student();
        stu1.setName("Nandni");
        stu1.setRoll("43CS");

        Student stu2=new Student();
        stu2.setName("Lucky");
        stu2.setRoll("29");

        //creating object Subject objects
        Subject sub1=new Subject();
        sub1.setScode(732);
        sub1.setName("Computer");

        Subject sub2=new Subject();
        sub2.setScode(332);
        sub2.setName("Maths");

        //creating list of student objects
        List<Student> student=new ArrayList<>();
        student.add(stu2);
        student.add(stu1);

        //creating list of subject objects
        List<Subject> subject=new ArrayList<>();
        subject.add(sub1);
        subject.add(sub2);

        stu2.setSubject(subject);
        
        sub1.setStudent(student);

        session.save(stu1);
        session.save(stu2);
        session.save(sub1);
        session.save(sub2);

        tl.commit();
        session.close();

        System.out.println("data inserted into database............");


    }
}
