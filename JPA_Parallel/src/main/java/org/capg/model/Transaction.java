package org.capg.model;
import java.time.LocalDate;

import javax.persistence.*;

@Entity
public class Transaction {
	
	@Id
	private long transactionId;
	private LocalDate transactionDate;
	private String transactionType;
	private double amount;
	private Account fromAccount;
	private Account toAccount;
	private String description;
	@ManyToOne(cascade=CascadeType.ALL)
	private Account account;
	
	
	public Transaction() {
		
	}
	public Transaction(long transactionId, LocalDate transactionDate, String transactionType, double amount,
			Account fromAccount, Account toAccount, String description, Account account) {
		super();
		this.transactionId = transactionId;
		this.transactionDate = transactionDate;
		this.transactionType = transactionType;
		this.amount = amount;
		this.fromAccount = fromAccount;
		this.toAccount = toAccount;
		this.description = description;
		this.account = account;
	}
	public long getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}
	public LocalDate getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(LocalDate transactionDate) {
		this.transactionDate = transactionDate;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Account getFromAccount() {
		return fromAccount;
	}
	public void setFromAccount(Account fromAccount) {
		this.fromAccount = fromAccount;
	}
	public Account getToAccount() {
		return toAccount;
	}
	public void setToAccount(Account toAccount) {
		this.toAccount = toAccount;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", transactionDate=" + transactionDate
				+ ", transactionType=" + transactionType + ", amount=" + amount + ", fromAccount=" + fromAccount
				+ ", toAccount=" + toAccount + ", description=" + description + ", account=" + account + "]";
	}
	

}
