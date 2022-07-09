package com.demo.client;

import com.demo.businesslogic.ProductRepo;
import com.demo.entity.Product;

public class ProductManage {

	public static void main(String[] args) {

		 Product product1 = new Product(); 
		 product1.setName("Iphone11 Pro");
		 product1.setColor("Black"); 
		 product1.setDescription("Great Camera");
		 ProductRepo.createProduct(product1);
		 System.out.println("Data Stored Successfully................");
		  
		  
		 Product product2 = new Product("Iphone12 Pro", "White", "Great processor");
		 ProductRepo.createProduct(product2);
		 System.out.println("Data Stored Successfully................");

		 
		  // if you remove the static in ProductRepo class of methods does not work 
		 if (ProductRepo.createProduct1("Iphone15 Pro", "Rose Gold", "Looks awesome")!=null) {
			 System.out.println("Data Stored Successfully................");
		 }else {
			 System.out.println("Data Insertion Failed..........."); 
		 }
		 

		Product prodbyid = ProductRepo.viewbyid(3);
		System.out.println("[ "+ "Product Id: " + prodbyid.getId() + ", Product Name: " + prodbyid.getName() + ", Product Color: " + prodbyid.getColor()
				+ ", Product Description: " + prodbyid.getDescription() + " ]");
		
		
		Product updateprodbyid = ProductRepo.updatebyid(7, "Iphone 5 SE", "White", "Great Design");
		System.out.println("Updated Data:     [ "+ "Product Id: " + updateprodbyid.getId() + ", Product Name: " + updateprodbyid.getName() + ", Product Color: " + updateprodbyid.getColor()
				+ ", Product Description: " + updateprodbyid.getDescription() + " ]");
		
		
		Product deletebyid = ProductRepo.deletebyid(8);
		System.out.println("Record ID: "+deletebyid.getId() +" Sussecfully Deleted....................................");
		
	}

}
