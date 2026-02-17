package com.capg.assessment.util;

import org.hibernate.*;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory factory;
		
		static {
			factory = new AnnotationConfiguration().configure("hibernate_annotation.cfg.xml").buildSessionFactory();
		}
		
		public static SessionFactory getSessionFactory() {
			return factory;
		}
	
}
