package com.demo.daoimpl;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.demo.dao.CompanyDao;
import com.demo.entity.Company;
import com.demo.factory.HibernateUtil;

public class CompanyDaoImpl implements CompanyDao {

	static Session session = null;
	static Transaction trans = null;
	
	@Override
	public Company saveCompany(Company company) {
		session = HibernateUtil.getSessionFact().openSession();		//obtaint the session for insert operations
		trans = session.beginTransaction();							//start transcation
		System.out.println("Saving Record................................");
		session.save(company);
		trans.commit();
		session.close();
		System.out.println("Terminating your Session...............................");
		return company;
	}

	@Override
	public Company saveCompany1(String name, String city) {
		session = HibernateUtil.getSessionFact().openSession();		//obtaint the session for insert operations
		trans = session.beginTransaction();							//start transcation
		
		Company com = new Company();
		com.setCompanyname(name);
		com.setCity(city);
		System.out.println("Saving Record................................");
		session.save(com);
		trans.commit();
		session.close();
		System.out.println("Terminating your Session...............................");
		return com;
	}

	@Override
	public Company viewCompanybyId(long id) {
		session = HibernateUtil.getSessionFact().openSession();		//obtaint the session for view operations
		trans = session.beginTransaction();							//start transcation
		
		Company comid = (Company) session.get(Company.class, id);
		System.out.println("Fetching Record................................");
		comid.getId();
		comid.getCompanyname();
		comid.getCity();
		trans.commit();
		session.close();
		System.out.println("Terminating your Session...............................");
		return comid;
	}

	@Override
	public Company updateCompanybyId(long id, String name, String city) {
		session = HibernateUtil.getSessionFact().openSession();		//obtaint the session for update operations
		trans = session.beginTransaction();							//start transcation
		
		Company combyid = (Company) session.get(Company.class, id);
		System.out.println("Data:     [ "+ "Company Id: " + combyid.getId() + ", Product Name: " + combyid.getCompanyname() + ", Product Color: " + combyid.getCity() + " ]");
		combyid.getId();
		combyid.setCompanyname(name);
		combyid.setCity(city);
		System.out.println("Updating Record................................");
		session.update(combyid);
		trans.commit();
		session.close();
		System.out.println("Terminating your Session...............................");
		return combyid;
	}

	@Override
	public Company deleteCompanybyId(long id) {
		session = HibernateUtil.getSessionFact().openSession();		//obtaint the session for delete operations
		trans = session.beginTransaction();							//start transcation
		
		Company comid = (Company) session.get(Company.class, id);
		System.out.println("Deleting Record..............................");
		session.delete(comid);
		trans.commit();
		session.close();
		System.out.println("Terminating your Session...............................");
		return comid;
	}

}
