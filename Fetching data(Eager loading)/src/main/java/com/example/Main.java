package com.example;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Configuration cfg=new Configuration();
        cfg.configure();
        SessionFactory sf=cfg.buildSessionFactory();
        Session session=sf.openSession();
        Transaction ts=session.beginTransaction();
       /*  student s1=new student();
        student s2=new student();
        student s3=new student();

        laptop l1=new laptop(123, "HP", s2);
        laptop l2=new laptop(224,"lenovo",s1);
        laptop l3=new laptop(345,"dell",s2);
        laptop l4=new laptop(333,"asus",s1);
        laptop l5=new laptop(443,"mac",s3);
        laptop l6=new laptop(543,"acer",s2);
        laptop l7=new laptop(456,"mi",s3);
        List<laptop>lp1=new ArrayList<>();
        List<laptop>lp2=new ArrayList<>();
        List<laptop>lp3=new ArrayList<>();

        lp1.add(l2);
        lp1.add(l4);
        
        lp2.add(l1);
        lp2.add(l3);
        lp2.add(l6);

        lp3.add(l5);
        lp3.add(l7);

        s1.setRollno(1);
        s1.setName("rohit");
        s1.setAl(lp1);

        s2.setRollno(2);
        s2.setName("suraj");
        s2.setAl(lp2);

        s3.setRollno(3);
        s3.setName("monoj");
        s3.setAl(lp3);

        session.save(l1);
        session.save(l2);
        session.save(l3);
        session.save(l4);
        session.save(l5);
        session.save(l6);
        session.save(l7);

        session.save(s1);
        session.save(s2);
        session.save(s3);
         */
        
        student fd=(student) session.get(student.class, 2);
        System.out.println(fd.getName());
       
        ts.commit();


    }
}