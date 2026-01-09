package com.learn.practice3;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.learn.entity.Bikes;
import com.learn.entity.Person;

public class App {
    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure("\\com\\learn\\hibernate\\hibernate.cfg.xml"); 
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();

        session.beginTransaction();

        // Persons
        Person p1 = new Person();
        p1.setId(1);
        p1.setName("Abinash");

        Person p2 = new Person();
        p2.setId(2);
        p2.setName("Rahul");

        // Bikes
        Bikes b1 = new Bikes(77, "Honda Shine", p1);
        Bikes b2 = new Bikes(78, "Hero Splendor", p1);
        Bikes b3 = new Bikes(87, "TVS", p2);
        Bikes b4 = new Bikes(79, "Ninja", p2);

        // Bike lists
        List<Bikes> bl1 = new ArrayList<>();
        bl1.add(b1);
        bl1.add(b2);

        List<Bikes> bl2 = new ArrayList<>();
        bl2.add(b3);
        bl2.add(b4);

        p1.setBikeList(bl1);
        p2.setBikeList(bl2);

        // Save
        session.save(p1);
        session.save(p2);
        session.save(b1);
        session.save(b2);
        session.save(b3);
        session.save(b4);

        session.getTransaction().commit();
        session.close();
        sf.close();
    }
}
