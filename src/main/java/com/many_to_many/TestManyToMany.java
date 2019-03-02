package com.many_to_many;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import net.bytebuddy.asm.Advice.ArgumentHandler.Factory;

public class TestManyToMany {

	
	 
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("myPersistanceUnit");
		
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		
		Students s1 = new Students();
		s1.setS_id(1);
		s1.setS_name("Sharmaji");
		
		Students s2 = new Students();
		s2.setS_id(2);
		s2.setS_name("vermaji");
		
		Trainer t1 = new Trainer();
		t1.setT_id(101);
		t1.setT_name("Mahesh");
		
		Trainer t2 = new Trainer();
		t2.setT_id(102);
		t2.setT_name("Sunil");
		
		Set<Students>s = new HashSet<>();
		s.add(s1);
		s.add(s2);
		
		Set<Trainer>t = new HashSet<>();
		t.add(t1);
		t.add(t2);
		
		s1.setSet(t);
		s2.setSet(t);
		
		t1.setStu(s);
		t2.setStu(s);
		
		manager.persist(s1);
		manager.persist(s2);
		
		manager.getTransaction().commit();
		manager.close();
		factory.close();
		
		
		
		
		
		
		
	}
}
