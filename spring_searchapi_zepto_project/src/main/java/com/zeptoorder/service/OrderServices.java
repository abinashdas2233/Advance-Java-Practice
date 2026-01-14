package com.zeptoorder.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zeptoorder.bean.Product;
import com.zeptoorder.dao.OrderRepo;
import com.zeptoorder.entity.ZeptoOrder;

@Service
public class OrderServices {
	@Autowired
	OrderRepo repo;
	
	public String postService(Product product) {
		System.out.println("inside post services"+product.toString());
		
		ZeptoOrder order=new ZeptoOrder();
		order.setItmName(product.getItmName());
		order.setPrice(product.getPrice());
		order.setDescription(product.getDescription());
		order.setQty(product.getQty());
		
		repo.storeData(order);
		
		return "Success";
		
		
	}

}
