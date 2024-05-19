package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	
    	//configuration
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        
        //creating sessionfactory
        SessionFactory factory=cfg.buildSessionFactory();
        
        //session
        Session session=factory.openSession();
        
        
        //Transaction
        Transaction tl=session.beginTransaction();
        
        //creating object of User class
        User u1=new User();
        u1.setId(5);
        u1.setName("Nandni");
        u1.setWork("Backend Developer");

        User u2=new User();
        u2.setId(7);
        u2.setName("Nidhi");
        u2.setWork("Frontend Developer");
       
        
        
        //save object 
        session.save(u1);
        session.save(u2);
        
        
        tl.commit();
        session.close();
        
        System.out.println("Data inserted successfully...............");
        
    }
}
