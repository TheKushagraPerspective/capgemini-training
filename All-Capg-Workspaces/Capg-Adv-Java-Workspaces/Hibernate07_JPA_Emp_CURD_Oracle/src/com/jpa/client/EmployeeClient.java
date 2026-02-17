package com.jpa.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jpa.beans.Employee;

public class EmployeeClient {
	public static void main(String[] args) {
		 
		// 1. Create EntityManagerFactory
		EntityManagerFactory emf =
				Persistence.createEntityManagerFactory("JPACRUD");

		// 2. Create EntityManager
		EntityManager em = emf.createEntityManager();

		// 3. Create Entity (TRANSIENT STATE)
		Employee employee = new Employee();
		employee.setFirstname("Ramesh");
		employee.setLastname("Kumar");
		employee.setEmail("Ramesh@gmail.com");
		employee.setEmpId(2);

		// 4. INSERT
		em.getTransaction().begin();
		em.persist(employee);  // INSERT
		em.getTransaction().commit();
 
		// 5. SELECT
		employee = em.find(Employee.class, 2);
		System.out.println(employee);

		// 6. UPDATE
		em.getTransaction().begin();
		employee.setFirstname("Babu");
		em.getTransaction().commit();
		System.out.println("Updated Employee :- " + employee);
		
		// 5. SELECT (chech whether first name is updated or not
		employee = em.find(Employee.class, 2);
		System.out.println(employee);
 
		// 7. DELETE
		em.getTransaction().begin();
		em.remove(employee);
		em.getTransaction().commit();

		// 8. Verify delete
		employee = em.find(Employee.class, 2);
		System.out.println("Employee after removal :- " + employee);

		// 9. Close resources
		em.close();
		emf.close();
 
	}
}

