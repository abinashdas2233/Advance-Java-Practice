package com.example.demo.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.InvoiceRepo;
import com.example.demo.entity.InvoiceReceipt;
import com.example.demo.request.InvoiceBean;

@Service

public class InvoiceService {
	@Autowired
	InvoiceRepo repo;
	
	public String generateReceipt(InvoiceBean invoice) {
		InvoiceReceipt ir=new InvoiceReceipt();
		ir.setDescription(invoice.getDescription());
		ir.setGstNo(invoice.getGstNo());
		ir.setInvValue(invoice.getInvValue());
		ir.setNote(invoice.getNote());
		ir.setStatus(invoice.getStatus());
		repo.save(ir);
		return "Invoice Generated";
	}
	public Map<String,String>getInvoice(int id){
		InvoiceReceipt rpt=repo.findById(id).get();
		HashMap<String,String>hm=new HashMap<>();
		hm.put("gstNo-",rpt.getGstNo());
		hm.put("description-", rpt.getDescription());
		hm.put("Status-", rpt.getStatus());
		return hm;
		
	}
	public String updateData(int id, String status) {

	    InvoiceReceipt ir = repo.findById(id)
	            .orElseThrow(() -> new RuntimeException("Invoice not found with id : " + id));

	    ir.setStatus(status);
	    repo.save(ir);

	    return "Update Done";
	}


}
