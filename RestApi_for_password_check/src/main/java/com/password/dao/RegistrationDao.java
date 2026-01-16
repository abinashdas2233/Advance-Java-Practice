package com.password.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.password.entity.UserInfo;
import com.password.services.RegistrationServices;

@Repository

public class RegistrationDao {
	@Autowired
	SessionFactory sf;
	
	public void userRegister(UserInfo info) {
		Session session=sf.openSession();
		session.save(info);
		Transaction tx=session.beginTransaction();
		tx.commit();
		
		
	}

}
