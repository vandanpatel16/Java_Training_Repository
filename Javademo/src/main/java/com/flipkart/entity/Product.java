package com.flipkart.entity;

public class Product {

	private long prodid;
	private String prodname;
	private String prodprice;
	private String proddesc;
	private String prodos;
	private String prodprocessor;
	
	
	public long getProdid() {
		return prodid;
	}
	public void setProdid(long prodid) {
		this.prodid = prodid;
	}
	public String getProdname() {
		return prodname;
	}
	public void setProdname(String prodname) {
		this.prodname = prodname;
	}
	public String getProdprice() {
		return prodprice;
	}
	public void setProdprice(String prodprice) {
		this.prodprice = prodprice;
	}
	public String getProddesc() {
		return proddesc;
	}
	public void setProddesc(String proddesc) {
		this.proddesc = proddesc;
	}
	public String getProdos() {
		return prodos;
	}
	public void setProdos(String prodos) {
		this.prodos = prodos;
	}
	public String getProdprocessor() {
		return prodprocessor;
	}
	public void setProdprocessor(String prodprocessor) {
		this.prodprocessor = prodprocessor;
	}
	
}
