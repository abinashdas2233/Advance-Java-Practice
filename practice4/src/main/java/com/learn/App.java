package com.learn;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Players;
import com.entity.Teams;

public class App {
    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        // Team CSK
        Teams csk = new Teams();
        csk.setTeamId(789);
        csk.setName("CSK");

        Players p1 = new Players(201, "Dhoni", csk);
        Players p2 = new Players(202, "Virat", csk);
        Players p3 = new Players(203, "Hardik", csk);

        csk.getPlayers().add(p1);
        csk.getPlayers().add(p2);
        csk.getPlayers().add(p3);

        // Team MI
        Teams mi = new Teams();
        mi.setTeamId(456);
        mi.setTeamName("MI");

        Players p4 = new Players(301, "Sachin", mi);
        Players p5 = new Players(302, "Rohit", mi);
        Players p6 = new Players(303, "De Villiers", mi);

        mi.getPlayers().setTeams(mi);
        mi.getPlayers().add(p5);
        mi.getPlayers().add(p6);

        // Save teams (players will auto-save if cascade is enabled)
        session.save(csk);
        session.save(mi);

        tx.commit();
        session.close();
        sf.close();

        System.out.println("Data inserted successfully!");
    }
}
