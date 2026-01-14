package com.zeptoorder.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.zeptoorder.entity.ZeptoOrder;
import com.zeptoorder.exception.ProductNotFoundException;

@Repository
public class OrderRepo {
	
	@Autowired
	SessionFactory sf;
	public String storeData(ZeptoOrder zo) {
		
		Session session = sf.openSession();
		Transaction trs = session.beginTransaction();
		session.save(zo);
		trs.commit();
		System.out.println("inside product dao");
		return "done";
		
	}
	
	
	
	public List<ZeptoOrder> searchProduct(String searchString) {
		System.out.println("search product");
		Session session = sf.openSession();
		List<ZeptoOrder> list = session.createQuery("FROM  ZeptoOrder where itmName LIKE: name", ZeptoOrder.class)
				.setParameter("name", "%" + searchString + "%").list();
		session.close();
		System.out.println("Search results: " + list);
		
		if(list.isEmpty() || list==null) {
			throw new ProductNotFoundException("Product Not Found");
		}else {
			return list;
		}
	}
	
}
