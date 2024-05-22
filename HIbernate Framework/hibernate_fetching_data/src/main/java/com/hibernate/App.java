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
        System.out.println( "data loading................." );

        //configuration
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");

        //session factory
        SessionFactory factory = cfg.buildSessionFactory();

        //session
        Session session =factory.openSession();

        //transaction
        /*Transaction tl=session.beginTransaction();


        //creting object of Person class
        Person p1=new Person();
        p1.setName("Nandni");
        
        //creating object of Address class
        Address a1=new Address();
        a1.setAid(453);
        a1.setCity("city1");
        a1.setStreet("street1");

        Address a2=new Address();
        a2.setAid(343);
        a2.setCity("City2");
        a2.setStreet("Street2");

        //creating list of Address
        List<Address> address=new ArrayList<>();
        address.add(a1);
        address.add(a2);

        p1.setAddress(address);

        a1.setPerson(p1);
        a2.setPerson(p1);

        session.save(p1);
        session.save(a1);
        session.save(a2);

        tl.commit();*/


        //fetch data using fetch type=lazy
       /*Person p1=session.get(Person.class, 1);
        System.out.println(p1.getId());
        System.out.println(p1.getName());

        System.out.println(p1.getAddress()); */

        //fetch data using fetch type=Eager
        Person p1=session.get(Person.class, 1);
        System.out.println(p1.getId());
        System.out.println(p1.getName());



        session.close();

        // System.out.println("Data inserted ...........................");
        
    }
}
