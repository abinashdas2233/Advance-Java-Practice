package com.zeptoorder.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zeptoorder.bean.Product;
import com.zeptoorder.entity.ZeptoOrder;
import com.zeptoorder.request.SearchProduct;
import com.zeptoorder.service.SearchServices;

@RestController
public class SearchController {
	@Autowired
	SearchServices sr;
	
	@GetMapping("/ordersearching")
	public ResponseEntity orderSearch(@RequestBody SearchProduct searchpro) {
		
		
		List<ZeptoOrder>list=sr.searchProductService(searchpro.getProductName());
		
		
		return ResponseEntity.ok(list);
		
	}

}
