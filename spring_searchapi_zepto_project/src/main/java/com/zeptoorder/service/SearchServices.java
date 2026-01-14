package com.zeptoorder.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.zeptoorder.bean.Product;
import com.zeptoorder.dao.OrderRepo;
import com.zeptoorder.entity.ZeptoOrder;

@Service
public class SearchServices {
	@Autowired
	OrderRepo repo;
	
		public List<ZeptoOrder> searchProductService(String searchString) {
			List<ZeptoOrder> products  = repo.searchProduct(searchString);
			return products;
		}
	

}
