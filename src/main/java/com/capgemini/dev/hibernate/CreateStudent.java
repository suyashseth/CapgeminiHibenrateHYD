package com.capgemini.dev.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CreateStudent {
public static void main(String[] args) {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistanceUnit");
	EntityManager manager = emf.createEntityManager();
	manager.getTransaction().begin();
	
	StudentTable student = new StudentTable();
    student.setSuserid(101);
    student.setSname("Dingi");
    student.setSpass("qwert");
    student.setSbacklogs(0);
    
    manager.persist(student);
    manager.getTransaction().commit();
    manager.clear();
	
	
}
}
