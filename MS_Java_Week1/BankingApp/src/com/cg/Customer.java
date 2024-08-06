package com.cg;

import java.util.List;
import java.util.Objects;

/**
 * @author adsupe
 *
 */
public class Customer {

	private String name;
	
	private Integer accountNumber;
	
	private String accountType;
	
	private Double availableBalance;
	
	private List<Transaction> transactions;
	
	public Customer(String name, Integer accountNumber, String accountType, Double availableBalance) {
		super();
		this.name = name;
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.availableBalance = availableBalance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Double getAvailableBalance() {
		return availableBalance;
	}

	public void setAvailableBalance(Double availableBalance) {
		this.availableBalance = availableBalance;
	}

	@Override
	public int hashCode() {
		return Objects.hash(accountNumber, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(accountNumber, other.accountNumber) && Objects.equals(name, other.name);
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}
	
}
