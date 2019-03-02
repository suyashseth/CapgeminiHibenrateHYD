package com.capgemini.dev.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DeleteStudent {
public static void main(String[] args) {
	
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("myPersistanceUnit");
	EntityManager manager = factory.createEntityManager();
	manager.getTransaction().begin();
	
	StudentTable student = manager.find(StudentTable.class, 101);
	manager.remove(student);
	
	manager.getTransaction().commit();
	manager.close();
	factory.close();
	
	
}
}
