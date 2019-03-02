package com.capgemini.dev.one_to_one;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestOne_To_One {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistanceUnit");
		EntityManager manager = emf.createEntityManager();
		manager.getTransaction().begin();

		User us = new User();
		us.setUserid(101);
		us.setUsername("Pinki");
		us.setPhoneno(987423689);

		Passport p1 = new Passport();
		p1.setPid(10010);
		p1.setPname("pinki");
		p1.setCountry("India");
		p1.setUs(us);

		manager.persist(p1);
		manager.getTransaction().commit();

		manager.close();
		emf.close();


	}

}
