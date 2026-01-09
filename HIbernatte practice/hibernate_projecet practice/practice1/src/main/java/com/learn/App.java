package com.learn;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.learn.entity.Student;


public class App {
    public static void main(String[] args) {
        Configuration cfg=new Configuration();
        cfg.configure("\\com\\learn\\config\\hibernate.cfg.xml");
        SessionFactory sf=cfg.buildSessionFactory();
        Student st=new Student(101,"abhi",2011);
        Session session=sf.openSession();
        Transaction txt=session.beginTransaction();
        session.save(st);
        txt.commit();
        session.close();
        
        
    }
}
