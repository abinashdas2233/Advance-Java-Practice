package com.example.demo.request;

public class InvoiceBean {
	private int invId;
	private int invValue;
	private String note;
	private String gstNo;
	private String status;
	private String description;
	public InvoiceBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public InvoiceBean(int invId, int invValue, String note, String gstNo, String status, String description) {
		super();
		this.invId = invId;
		this.invValue = invValue;
		this.note = note;
		this.gstNo = gstNo;
		this.status = status;
		this.description = description;
	}
	public int getInvId() {
		return invId;
	}
	public void setInvId(int invId) {
		this.invId = invId;
	}
	public int getInvValue() {
		return invValue;
	}
	public void setInvValue(int invValue) {
		this.invValue = invValue;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getGstNo() {
		return gstNo;
	}
	public void setGstNo(String gstNo) {
		this.gstNo = gstNo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "InvoiceBean [invId=" + invId + ", invValue=" + invValue + ", note=" + note + ", gstNo=" + gstNo
				+ ", status=" + status + ", description=" + description + "]";
	}
	
	

}
