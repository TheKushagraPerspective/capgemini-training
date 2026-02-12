package com.capg.main;

import com.capg.model.Student;


public class StudentInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction txn = null;
		
		try {
			
//			step 1:
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.config.xml");
			
//			step 2:
			sessionFactory = cfg.buildSessionFactory();
			session = sessionFactory.openSession();
			
//			step 3:
			txn = session.beginTransaction();
			
//			step 4:
			Student stu = new Student();
			stu.setId(1);
			stu.setName("Kushagra Varshney");
			stu.setMarks(88.8);
			
//			step 5:
			session.save(stu);
			
//			step 6:
			txn.commit();
			
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
