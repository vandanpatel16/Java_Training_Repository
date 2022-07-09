package com.demo.dao;

import com.demo.entity.Company;

public interface CompanyDao {

	Company saveCompany(Company company);
	
	Company saveCompany1(String name, String city);
	
	Company viewCompanybyId(long id);
	
	Company updateCompanybyId(long id, String name, String city);
	
	Company deleteCompanybyId(long id);
}
