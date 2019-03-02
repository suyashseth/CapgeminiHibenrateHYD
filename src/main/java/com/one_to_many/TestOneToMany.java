package com.one_to_many;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestOneToMany {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("myPersistanceUnit");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
        
		Pencil p1 = new Pencil();
		p1.setPname("Apsara");
		p1.setPid(10001);
		
		Pencil p2 = new Pencil(); 
		p2.setPname("Nataraj");
		p2.setPid(100002);
		
		Pencil p3 =  new Pencil();
		p3.setPname("shakalaka boom boom");
		p3.setPid(10004);
		
		PencilBox pb = new PencilBox();
		pb.setBox_cap(5);
		pb.setBox_id(101);
		
		List<Pencil>p = new ArrayList<>();
		p.add(p1);
		p.add(p2);
		p.add(p3);
		
		pb.setP(p);
		
		manager.persist(pb);
		
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
				
	}
}
