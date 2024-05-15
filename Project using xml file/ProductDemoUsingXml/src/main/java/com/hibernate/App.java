package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
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
        
        //creating object of Product class
        Product p1=new Product();
        p1.setId(45);
        p1.setName("AC");
        
        Product p2=new Product();
        p2.setId(89);
        p2.setName("Laptop");
        
        Product p3=new Product();
        p3.setId(12);
        p3.setName("Mobile");
        
        
        //save object 
        session.save(p1);
        session.save(p2);
        session.save(p3);
        
        
        tl.commit();
        session.close();
        
        
    }
}
