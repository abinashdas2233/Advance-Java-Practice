package com.ajioorder.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ajioorder.bean.OrderInfo;
import com.ajioorder.dao.OrderRepo;
import com.ajioorder.entity.Order;

@Service
public class OrderServices {
	@Autowired
	OrderRepo repo;
	
	public int  storeData(OrderInfo order) {
		System.out.println("storeing data command is comming from controller");
		
		Order entityOrder=new Order();
		entityOrder.setName(order.getName());
		entityOrder.setPrice(order.getPrice());
		entityOrder.setAddress(order.getAddress());
		System.out.println(entityOrder.toString()+"........");
		
		int res=repo.saveOrder(entityOrder);
		return res;
		
	}
	

}
