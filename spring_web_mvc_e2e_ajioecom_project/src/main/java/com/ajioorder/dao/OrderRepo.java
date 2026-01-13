package com.ajioorder.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ajioorder.entity.Order;



@Repository
public class OrderRepo {
	@Autowired
	SessionFactory sf;
	
	
	public int saveOrder(Order orderEntity) {
		System.out.println("Ordre DAO: Item Name: " + orderEntity.getName());
		Session session = sf.openSession();
		Transaction tsn = session.beginTransaction();
		System.out.println("Save Order Starting....");
		Integer response = (Integer) session.save(orderEntity);
		tsn.commit();
		System.out.println("Save Order : Completed " + response);
		return response;
		
	}
	
	

}
