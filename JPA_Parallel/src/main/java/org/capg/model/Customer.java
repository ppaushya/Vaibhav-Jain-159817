package org.capg.model;
import java.time.LocalDate;


import java.util.Set;

import javax.persistence.*;



@Entity
public class Customer {
	
	@Id
	private int customerId;
	private String firstName;
	private String lastName;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Address address;
	
	private String emailId;
	private String mobile;
	private LocalDate dateOfBirth;
	
	@OneToMany(mappedBy="customer",targetEntity=Account.class,
			cascade=CascadeType.ALL)
	private Set<Account> accounts;
	
	@Transient
	private String password;
	
	

	public Customer() {
		
	}

	public Customer(int customerId, String firstName, String lastName, Address address, String emailId, String mobile,
			LocalDate dateOfBirth, Set<Account> accounts, String password) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.emailId = emailId;
		this.mobile = mobile;
		this.dateOfBirth = dateOfBirth;
		this.accounts = accounts;
		this.password = password;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Set<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(Set<Account> accounts) {
		this.accounts = accounts;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", address=" + address + ", emailId=" + emailId + ", mobile=" + mobile + ", dateOfBirth="
				+ dateOfBirth + ", accounts=" + accounts + ", password=" + password + "]";
	}
	
	
	

	
}
