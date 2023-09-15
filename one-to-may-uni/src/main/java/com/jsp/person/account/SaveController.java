package com.jsp.person.account;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("shivam");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();	
		Person person =new Person();
		person.setName("shivam");
		person.setEmail("at965@gamil.com");
		person.setGender("male");
		
		Account account = new Account();
		account.setAcc_no(7021555);
		account.setBank_acco("icic");
		account.setIfdc_code("icic47gfd");
		
		Account account1 = new Account();
		account1.setAcc_no(7055255);
		account1.setBank_acco("kotak");
		account1.setIfdc_code("kotak47gfd");
		
		Account account2 = new Account();
		account2.setAcc_no(7660555);
		account2.setBank_acco("hdfc");
		account2.setIfdc_code("hdfc47gfd");

		List<Account> accounts = new ArrayList<Account>();
		accounts.add(account);
		accounts.add(account1);
		accounts.add(account2);
		

		person.setAccount(accounts);
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(account);
		entityManager.persist(account1);
		entityManager.persist(account2);
		entityTransaction.commit();
	}

}
