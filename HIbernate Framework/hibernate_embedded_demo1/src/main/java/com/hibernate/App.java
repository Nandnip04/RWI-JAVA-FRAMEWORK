package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "data loading............." );

        //Configuration
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");

        //session factory
        SessionFactory factory =cfg.buildSessionFactory();

        //session
        Session session=factory.openSession();

        //transaction
        Transaction tl=session.beginTransaction();


        //creating first object of Animal
        Animal a1=new Animal();
        a1.setId(1);
        a1.setCategories("Dogs");

        //creating first Dog object
        Dog d1=new Dog();
        d1.setName("Yog");
        a1.setDog(d1);

        //creating second object of Animal
        Animal a2=new Animal();
        a2.setId(3);
        a2.setCategories("Dogs");

        //creating second object of Dog
        Dog d2=new Dog();
        d2.setName("Jiv");
        a2.setDog(d2);
        

        session.save(a1);
        session.save(a2);

        tl.commit();
        session.close();

        System.out.println("Data loaded successfuly...........");
    }
}
