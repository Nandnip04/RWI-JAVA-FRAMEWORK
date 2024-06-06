package com.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjdbc.dao.StudentDao;
import com.springjdbc.entity.Student;

public class App {
    public static void main(String[] args) {
        ApplicationContext context =new ClassPathXmlApplicationContext("config.xml");
        StudentDao dao=context.getBean("studentDao",StudentDao.class);
        Student student=new Student();
        student.setId(12);
        student.setName("Diya");
        student.setAddress("Indore");
        int result=dao.insert(student);
        System.out.println("Student added :"+result);
    }
}
