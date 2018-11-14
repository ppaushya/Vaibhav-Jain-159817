package org.capg.model;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import javax.persistence.*;

@Entity
public class Account {
	
	@Id
	private long accountNo;
	private AccountType accountType;
	private LocalDate openingDate;
	private double openingBalance;
	private String description;
	@ManyToOne(cascade=CascadeType.ALL)
	private Customer customer;
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<Transaction> transactions;

	
	public Account() {
		
	}

	public Account(long accountNo, AccountType accountType, LocalDate openingDate, double openingBalance,
			String description, Customer customer, List<Transaction> transactions) {
		super();
		this.accountNo = accountNo;
		this.accountType = accountType;
		this.openingDate = openingDate;
		this.openingBalance = openingBalance;
		this.description = description;
		this.customer = customer;
		this.transactions = transactions;
	}

	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public LocalDate getOpeningDate() {
		return openingDate;
	}

	public void setOpeningDate(LocalDate openingDate) {
		this.openingDate = openingDate;
	}

	public double getOpeningBalance() {
		return openingBalance;
	}

	public void setOpeningBalance(double openingBalance) {
		this.openingBalance = openingBalance;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", accountType=" + accountType + ", openingDate=" + openingDate
				+ ", openingBalance=" + openingBalance + ", description=" + description + ", customer=" + customer
				+ ", transactions=" + transactions + "]";
	}
	
	

}
