package com.mycompany.project.client;

public class cart {
	private String tagno;
	private String type;
	private String mrp;
	private String discount;
	private String quantity;
	private boolean table2;
	private String enteredquantity;
	
	public cart(String tagno, String type, String mrp, String discount, String enteredquantity, String quantity, boolean table2){
		this.tagno = tagno;
		this.type = type;
		this.mrp = mrp;
		this.discount = discount;
		this.quantity = quantity;
		this.table2 = table2;
		this.enteredquantity = enteredquantity;
	}
	public boolean gettable2(){
		return this.table2;
	}
	public String getenteredquantity(){
		return this.enteredquantity;
	}
	public String gettagno(){
		return this.tagno;
	}
	public String gettype(){
		return this.type;
	}
	public String getmrp(){
		return this.mrp;
	}
	public String getdiscount(){
		return this.discount;
	}
	public String getquantity(){
		return this.quantity;
	}
}
