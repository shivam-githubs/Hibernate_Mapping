package com.jsp.person.accounts;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class SaveController {
public static void main(String[] args) {
		
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("shivam");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction(); 
	Person person =new Person();
	person.setName("Harshali");
	person.setEmail("at932451");
	person.setCn(44454444l);
	
	BankAccount backAccount = new BankAccount();
	backAccount.setAcc_no(7021555);
	backAccount.setBank_acco("icic");
	backAccount.setIfdc_code("icic47gfd");
	
	BankAccount backAccount1 = new BankAccount();
	backAccount1.setAcc_no(7055255);
	backAccount1.setBank_acco("kotak");
	backAccount1.setIfdc_code("kotak47gfd");
	
	BankAccount backAccount2 = new BankAccount();
	backAccount2.setAcc_no(7660555);
	backAccount2.setBank_acco("hdfc");
	backAccount2.setIfdc_code("hdfc47gfd");
	
	backAccount1.setPerson(person);
	backAccount2.setPerson(person);
	backAccount.setPerson(person);
	
	
	entityTransaction.begin();
	entityManager.persist(person);
	entityManager.persist(backAccount1);
	entityManager.persist(backAccount2);
	entityManager.persist(backAccount);
	entityTransaction.commit();

	
	
	}	
}
