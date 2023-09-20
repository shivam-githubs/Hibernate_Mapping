package com.jsp.bank.braches;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DriverBank {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("shivam");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Bank bank = new Bank();
		bank.setName("SBI");

		Branch branch = new Branch();
		branch.setAddress("Nerul");

		Branch branch2 = new Branch();
		branch2.setAddress("Uran");

		Branch branch3 = new Branch();
		branch3.setAddress("kamothe");

		Branch branch4 = new Branch();
		branch4.setAddress("Pen");

		List<Branch> branches = new ArrayList<Branch>();
		branches.add(branch);
		branches.add(branch2);
		branches.add(branch3);
		branches.add(branch4);

		bank.setBranch(branches);
		branch.setBank(bank);
		branch2.setBank(bank);
		branch3.setBank(bank);
		branch4.setBank(bank);

		entityTransaction.begin();
		entityManager.persist(bank);
		entityManager.persist(branch);
		entityManager.persist(branch2);
		entityManager.persist(branch3);
		entityManager.persist(branch4);
		entityTransaction.commit();

	}

}
