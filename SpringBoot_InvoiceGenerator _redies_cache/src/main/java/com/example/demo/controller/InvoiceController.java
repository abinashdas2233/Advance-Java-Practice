package com.example.demo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.request.InvoiceBean;
import com.example.demo.request.UpdateInvoice;
import com.example.demo.services.InvoiceService;

@RestController
public class InvoiceController {
	
	@Autowired
	InvoiceService service;
	
	@PostMapping("/genarate")
	public String generateInvoice(@RequestBody InvoiceBean invoice) {
		System.out.println(invoice.toString());
		service.generateReceipt(invoice);
		return "Invoice generated";
	}
	
	@GetMapping("/getInvoiceById/{invId}")
	public ResponseEntity getInvoiceById(@PathVariable int invId) {
	    Map<String,String> res = service.getInvoice(invId);
	    return ResponseEntity.ok(res);
	}
	@PatchMapping("ptch")
	public String update(@RequestBody UpdateInvoice invoice) {
		int id=invoice.getInvoiceId();
		String update_staus=invoice.getStatus();
		System.out.println(id+" "+update_staus);
		service.updateData(id, update_staus);
		
		return "update done";
		
		
		
	}


}
