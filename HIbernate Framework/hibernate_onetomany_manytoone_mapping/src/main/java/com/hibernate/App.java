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
        System.out.println("data loading...........");

        //Configuration
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");

        //session factory
        SessionFactory factory=cfg.buildSessionFactory();

        //session
        Session session=factory.openSession();

        //Transaction 
        Transaction tl=session.beginTransaction();

        //creating first Bank object
        Bank b1=new Bank();
        b1.setName("Bank of India");

        //creating Account objects
        Account a1=new Account();
        a1.setAid(54);
        a1.setName("Nandni Patel");
        a1.setNumber("42984540");
        a1.setBank(b1);

        
        Account a2=new Account();
        a2.setAid(29);
        a2.setName("Lucky Patel");
        a2.setNumber("98039209");
        a2.setBank(b1);

        //creating list of account
        List <Account> account=new ArrayList<>();
        account.add(a1);
        account.add(a2);

        b1.setAccount(account);

        session.save(a1);
        session.save(a2);
        session.save(b1);

        tl.commit();
        session.close();

        System.out.println("Data inserted into data base successfully ................");


        
    }
}
