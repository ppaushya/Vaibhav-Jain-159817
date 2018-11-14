package org.capg.model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class BootClass {

	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("jpademo");
		EntityManager entityManager= emf.createEntityManager();
		
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		Set<Account> accounts=new HashSet<>();
		Customer customer=new Customer(1000,"Ram","Rahim",null,"ram@gmail.com","8989709890",LocalDate.now(),null,"ram123");
		Address address=new Address(123, "23,North East","Near Capgemini", "Chennai", "TN", 507302,customer);
		customer.setAddress(address);
		Account account=new Account(123456,AccountType.CURRENT,LocalDate.now(),500,"This is ano",customer,null);
		accounts.add(account);
		customer.setAccounts(accounts);
		
		entityManager.persist(account);
		entityManager.persist(address);
		entityManager.persist(customer);

		
		transaction.commit();

	}

}
