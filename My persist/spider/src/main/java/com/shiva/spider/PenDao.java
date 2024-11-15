package com.shiva.spider;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class PenDao {
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("shiva");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	public void insertPen(Pen p) {
		et.begin();
		em.persist(p);
		et.commit();
		System.out.println("Data inserted");
	}

}
