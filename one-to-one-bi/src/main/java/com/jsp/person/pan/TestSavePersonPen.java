package com.jsp.person.pan;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSavePersonPen {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("shivam");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();	
		Person person =new Person();
		person.setName("SHIVAM");
		person.setEmail("at9324510@mail.com");
		person.setCn(7021958695l);
	
		Pan pen = new Pan();
		pen.setAdd("Mumbai");
		pen.setPerson(person);
		person.setPan(pen);
		
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(pen);
		entityTransaction.commit();
		
		
	}

}
