package com.capg.hibernate;

//import org.hibernate.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class StudentInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction txn = null;
		
		try {
			
//			step 1:
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");      // loads hibernate.config.xml
			
//			step 2:
			sessionFactory = cfg.buildSessionFactory();
			session = sessionFactory.openSession();
			
//			step 3:
			txn = session.beginTransaction();
			
//			step 4:
			Student stu = new Student();
			stu.setSno(1);
			stu.setSname("Kushagra Varshney");
			stu.setEmail("kushagravarshney.tech@gmail.com");
			stu.setMobile(9876543210L);
			
//			step 5:
			session.save(stu);
			
//			step 6:
			txn.commit();
			System.out.println("Record inserted successfully");
			
		}
		catch(Exception e) {
			if(txn != null) {
				txn.rollback();
			}
			System.out.println(e);
		}
		finally {
			if(session != null) {
				session.close();
			}
		    if(sessionFactory != null) {
		    	sessionFactory.close();
		    }
		}
		

	}

}
