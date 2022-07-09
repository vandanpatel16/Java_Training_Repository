package com.demo.factory;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

	private static SessionFactory sessionfactory = null;
	
	public static SessionFactory getSessionFact() {
		
		System.out.println("Hibernate Configuration is in Process...................");
		Configuration configobj = new Configuration();
		configobj.configure("hibernate.cfg.xml");
		
		ServiceRegistry serviceregistryobj = new StandardServiceRegistryBuilder().applySettings(configobj.getProperties()).build();
		System.out.println("Hibernate is Configured................");
		
		System.out.println("Creating your Session..............");
		sessionfactory = configobj.buildSessionFactory(serviceregistryobj);
		System.out.println("Your Session has Begin.............................");
		return sessionfactory;
	}
}
