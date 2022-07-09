package com.demo.dao;

import com.demo.entity.Company;
import com.demo.entity.Product;

public interface ProductDao {

	Product saveProduct(Product product);
	
	Product saveProduct1(String name, String color, String descrption, Company id);
	
	Product viewProductbyId(long id);
	
	Product updateProductbyId(long id, String name, String color, String description);
	
	Product deleteProductbyId(long id);
}
