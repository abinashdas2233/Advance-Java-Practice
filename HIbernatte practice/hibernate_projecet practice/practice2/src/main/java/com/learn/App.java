package com.learn;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.learn.entity.Student;

public class App {
    public static void main(String[] args) {
        Configuration cfg=new Configuration();
        cfg.configure("\\com\\learn\\hibernate\\hibernate.cfg.xml");
        SessionFactory sf=cfg.buildSessionFactory();
        Student st1=new Student(101,"kanha",2022);
        Student st2=new Student(102,"abhi",2023);
        Session session=sf.openSession();
        session.save(st1);
        session.save(st2);
        Transaction txt=session.beginTransaction();
        txt.commit();
        session.close();
    }
}
