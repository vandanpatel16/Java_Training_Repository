package com.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table
@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Product_ID")
	private long id;
	
	@Column(name = "Product_Name")
	private String name;
	
	@Column(name = "Product_Color")
	private String color;
	
	@Column(name = "Product_Description")
	private String description;
	
	@ManyToOne
	@JoinColumn(name = "fk_Company_Id")
	private Company comapany_id;
	
	
	
	public Product() {
		
	}


	public Product(String name, String color, String description, Company comapany_id) {
		this.name = name;
		this.color = color;
		this.description = description;
		this.comapany_id = comapany_id;
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Company getComapany_id() {
		return comapany_id;
	}
	public void setComapany_id(Company comapany_id) {
		this.comapany_id = comapany_id;
	}
	
}
