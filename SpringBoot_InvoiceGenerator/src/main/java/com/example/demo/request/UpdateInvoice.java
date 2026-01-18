package com.example.demo.request;

public class UpdateInvoice {
	private int invoiceId;
	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String staus) {
		this.status = staus;
	}

	public int getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}

	public UpdateInvoice(int invoiceId) {
		super();
		this.invoiceId = invoiceId;
	}

	public UpdateInvoice() {
		super();
	}
	

}
