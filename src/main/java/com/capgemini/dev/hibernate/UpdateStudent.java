package com.capgemini.dev.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UpdateStudent {
public static void main(String[] args) {
	
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("myPersistanceUnit");
	EntityManager manager  = factory.createEntityManager();
	manager.getTransaction().begin();
	
	StudentTable student = manager.find(StudentTable.class, 105);
	student.setSbacklogs(0);
	student.setSpass("indian");
	
	manager.persist(student);
	manager.getTransaction().commit();
	
	manager.close();
	factory.close();
	
	
	
	
	
}
}
