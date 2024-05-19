package com.hibernate;

import java.io.FileInputStream;
import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "image uploading......" );
        
        
        //configuratiom
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        
        //sessionFactory
        SessionFactory factory=cfg.buildSessionFactory();
        
        //session
        Session session=factory.openSession();
        
        //creating object of Employee
        Employee e1=new Employee();
        e1.setId(45);
        e1.setName("Nandni");
        e1.setNumber("34892483");
        e1.setCity("Pandhana");
        
        
        Employee e2=new Employee();
        e2.setId(34);
        e2.setName("Mansi");
        e2.setNumber("87292483");
        e2.setCity("Burhanpur");
        e2.setCity(null);
        
        
        
        //adding image for first employee
        FileInputStream fis=new FileInputStream("C:\\Users\\HP\\Documents\\Hibernate repo\\RWI-JAVA-FRAMEWORK\\HIbernate Framework\\ImageSaveDemo\\src\\main\\java\\pic3.jpg");
        byte[] data=new byte[fis.available()];
        fis.read(data);
        e1.setImage(data);

        //adding image for second employee
        FileInputStream fis2=new FileInputStream("C:\\Users\\HP\\Documents\\Hibernate repo\\RWI-JAVA-FRAMEWORK\\HIbernate Framework\\ImageSaveDemo\\src\\main\\java\\kanha.jpg");
        byte[] data2=new byte[fis2.available()];
        fis2.read(data2);
        e2.setImage(data2);
        
        //Transaction 
        Transaction tl=session.beginTransaction();
        
        
        //save object 
        session.save(e1);
        session.save(e2);
        
        tl.commit();
        session.close();
        
        System.out.println("image saved into database........");
        
        
    }
}
