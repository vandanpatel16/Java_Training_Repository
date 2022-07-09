package com.demo.client;

import com.demo.businesslogic.CompanyRepo;
import com.demo.businesslogic.ProductRepo;
import com.demo.entity.Company;
import com.demo.entity.Product;

public class Manage {

	
	public static void main(String[] args) {

		
		 Company company = new Company();
		 company.setCompanyname("Apple");
		 company.setCity("Califonia");
		 CompanyRepo.createCompany(company);
		 System.out.println("Data Stored Successfully................");

		 Product product1 = new Product(); 
		 product1.setName("Iphone11 Pro");
		 product1.setColor("Black"); 
		 product1.setDescription("Great Camera");
		 product1.setComapany_id(company);
		 ProductRepo.createProduct(product1);
		 System.out.println("Data Stored Successfully................");
		

		 
		 Company company1 = new Company("Apple", "London");
		 CompanyRepo.createCompany(company1);
		 System.out.println("Data Stored Successfully................");	 
		 
		 Product product2 = new Product("Iphone12 Pro", "White", "Great processor", company1);
		 ProductRepo.createProduct(product2);
		 System.out.println("Data Stored Successfully................");
		 

		
		Company compbyid = CompanyRepo.viewbyid(1);
		System.out.println("[ "+ "Company Id: " + compbyid.getId() + ", Company Name: " + compbyid.getCompanyname() + ", Comapany City: " + compbyid.getCity() +" ]");
		
		Product prodbyid = ProductRepo.viewbyid(2);
		Company com = prodbyid.getComapany_id();
		System.out.println("[ "+ "Product Id: " + prodbyid.getId() + ", Product Name: " + prodbyid.getName() + ", Product Color: " + prodbyid.getColor()
				+ ", Product Description: " + prodbyid.getDescription() + ", Company Id: " + com.getId()+" ]");
		
		
		
		Company updatecompbyid = CompanyRepo.updatebyid(2, "Apple", "Toronto");
		System.out.println("Updated Data:     [ "+ "Company Id: " + updatecompbyid.getId() + ", Product Name: " + updatecompbyid.getCompanyname() + ", Product Color: " + updatecompbyid.getCity() + " ]");
		
		Product updateprodbyid = ProductRepo.updatebyid(2, "Iphone 14", "Red", "Great Design");
		System.out.println("Updated Data:     [ "+ "Product Id: " + updateprodbyid.getId() + ", Product Name: " + updateprodbyid.getName() + ", Product Color: " + updateprodbyid.getColor()
				+ ", Product Description: " + updateprodbyid.getDescription() + " ]");
		
		
		 Product deletebyid = ProductRepo.deletebyid(2);
		 System.out.println("Record ID: "+deletebyid.getId() +" Sussecfully Deleted....................................");
		
	}

}
