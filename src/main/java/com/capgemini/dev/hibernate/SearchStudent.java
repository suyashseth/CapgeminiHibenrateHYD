package com.capgemini.dev.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SearchStudent {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("myPersistanceUnit");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		
		StudentTable student = manager.find(StudentTable.class, 105);
		System.out.println(student);
		
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();

		
	}	
}
