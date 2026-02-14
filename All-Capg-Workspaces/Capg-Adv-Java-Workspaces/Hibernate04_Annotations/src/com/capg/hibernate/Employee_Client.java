package com.capg.hibernate;

import org.hibernate.Transaction;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.Session;

public class Employee_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfiguration acfg = new AnnotationConfiguration();
		acfg.configure("hibernate_annotation.cfg.xml");
		
		SessionFactory factory = acfg.buildSessionFactory();
		
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		
		try {
			Employee emp = new Employee();
			emp.setFirstName("Kushagra");
			emp.setLastName("Varshney");
			emp.setSal(708000);
			
			session.save(emp);
			txn.commit();
		}
		catch(HibernateException e) {
			if(txn != null) {
				txn.rollback();
			}
			System.out.println(e);
		}
		finally {
			if(session != null) {
				session.close();
			}
//			if(factory != null) {
//				factory.close();
//			}
		}

	}

}
