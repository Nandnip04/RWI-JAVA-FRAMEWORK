package com.hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Data loading..........." );

        //Configuration
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");

        //session factory
        SessionFactory factory=cfg.buildSessionFactory();

        //session
        Session session=factory.openSession();

        //Transaction 
        Transaction tl=session.beginTransaction();

        //creating first developer object
        Developer d1=new Developer();
        d1.setName("Nandni");
        d1.setWork("develope software application");

        //creating first laptop object
        Laptop l1=new Laptop();
        l1.setLpId(8738);
        l1.setCname("Hp");
        d1.setLaptop(l1);

        //creating second developer object
        Developer d2=new Developer();
        d2.setName("Tanisha");
        d2.setWork("debugg error");

        //creating first laptop object
        Laptop l2=new Laptop();
        l2.setLpId(3438);
        l2.setCname("Apple");
        d2.setLaptop(l2);

        //Save object into database
        session.save(l1);
        session.save(l2);
        session.save(d1);
        session.save(d2);



        tl.commit();
        session.close();

        System.out.println("Data inserted into data base successfully..........");


    }
}
