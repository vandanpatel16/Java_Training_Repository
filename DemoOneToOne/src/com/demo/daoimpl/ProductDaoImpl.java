package com.demo.daoimpl;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.demo.dao.ProductDao;
import com.demo.entity.Company;
import com.demo.entity.Product;
import com.demo.factory.HibernateUtil;

public class ProductDaoImpl implements ProductDao {

	static Session session = null;
	static Transaction trans = null;
	
	@Override
	public Product saveProduct(Product product) {
		session = HibernateUtil.getSessionFact().openSession();		//obtaint the session for insert operations
		trans = session.beginTransaction();							//start transcation
		System.out.println("Saving Record................................");
		session.save(product);
		trans.commit();
		session.close();
		System.out.println("Terminating your Session...............................");
		return product;
	}

	@Override
	public Product saveProduct1(String name, String color, String descrption, Company id) {
		session = HibernateUtil.getSessionFact().openSession();		//obtaint the session for insert operations
		trans = session.beginTransaction();							//start transcation
		
		Product prod = new Product();
		prod.setName(name);
		prod.setColor(color);
		prod.setDescription(descrption);
		prod.setComapany_id(id);
		System.out.println("Saving Record................................");
		session.save(prod);
		trans.commit();
		session.close();
		System.out.println("Terminating your Session...............................");
		return prod;
	}
	
	@Override
	public Product viewProductbyId(long id) {
		session = HibernateUtil.getSessionFact().openSession();		//obtaint the session for view operations
		trans = session.beginTransaction();							//start transcation
		
		Product proid = (Product) session.get(Product.class, id);
		System.out.println("Fetching Record................................");
		proid.getId();
		proid.getName();
		proid.getColor();
		proid.getDescription();
		proid.getComapany_id();
		trans.commit();
		session.close();
		System.out.println("Terminating your Session...............................");
		return proid;
	}

	@Override
	public Product updateProductbyId(long id, String name, String color, String description) {
		session = HibernateUtil.getSessionFact().openSession();		//obtaint the session for update operations
		trans = session.beginTransaction();							//start transcation
		
		Product proid = (Product) session.get(Product.class, id);
		System.out.println("Data:     [ "+ "Product Id: " + proid.getId() + ", Product Name: " + proid.getName() + ", Product Color: " + proid.getColor()
		+ ", Product Description: " + proid.getDescription() + " ]");
		proid.getId();
		proid.setName(name);
		proid.setColor(color);
		proid.setDescription(description);
		System.out.println("Updating Record................................");
		session.update(proid);
		trans.commit();
		session.close();
		System.out.println("Terminating your Session...............................");
		return proid;
	}

	@Override
	public Product deleteProductbyId(long id) {
		session = HibernateUtil.getSessionFact().openSession();		//obtaint the session for delete operations
		trans = session.beginTransaction();							//start transcation
		
		Product proid = (Product) session.get(Product.class, id);
		System.out.println("Deleting Record..............................");
		session.delete(proid);
		trans.commit();
		session.close();
		System.out.println("Terminating your Session...............................");
		return proid;
	}

}
