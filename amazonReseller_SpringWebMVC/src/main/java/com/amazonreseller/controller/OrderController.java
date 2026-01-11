package com.amazonreseller.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OrderController {
	static int stockCount=0;
	static String productName="no product";
	@RequestMapping("/ordercreate")
	public String createStock(@RequestParam("product") String product,@RequestParam("quantity") String quantity,Model model) {
		stockCount=Integer.parseInt(quantity);
		productName=product;
		model.addAttribute("name", productName);
		model.addAttribute("quant", stockCount);
		
		return "viewstock";
	}
	@RequestMapping("/view")
	public String viewStock(Model model) {
		model.addAttribute("name", productName);
		model.addAttribute("quant", stockCount);
		return "viewstock";
	}
	@RequestMapping("/updating")
	public String updateStock(@RequestParam("product") String product,@RequestParam("quantity") String quantity,Model model) {
		model.addAttribute("name", productName);
		stockCount=stockCount+Integer.parseInt(quantity);
		model.addAttribute("quant", stockCount);
		return "viewstock";
	}
	@RequestMapping("/deleteing")

	public String deleteStock(Model model) {
		stockCount=0;
		productName="no product";
		model.addAttribute("name", productName);
		model.addAttribute("quant", stockCount);
		return "viewstock";
		
	}

}
