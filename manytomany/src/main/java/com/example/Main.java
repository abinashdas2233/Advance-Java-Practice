package com.example;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Configuration configuration=new Configuration();
        configuration.configure();
        SessionFactory sf=configuration.buildSessionFactory();
        Session session=sf.openSession();
        Transaction ts=session.beginTransaction();
        employee e1=new employee();
        employee e2=new employee();

        project p1=new project();
        project p2=new project();

        e1.setId(33);
        e1.setName("abinash");

        e2.setId(44);
        e2.setName("Ram");

        p1.setPid(1231);
        p1.setProject("hpm project");

        p2.setPid(4321);
        p2.setProject("hall project");


        List<employee>el=new ArrayList<>();
        List<project>pl=new ArrayList<>();
        el.add(e1);
        el.add(e2);

        pl.add(p1);
        pl.add(p2);

        e1.setPl(pl);
        p1.setPr(el);

        List<project>s2=new ArrayList<>();
        s2.add(p2);

        e2.setPl(s2);
        
        session.save(e1);
        session.save(e2);
        
        session.save(p1);
        session.save(p2);
        ts.commit();
        session.close();
        
    }
}