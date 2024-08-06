package com.cg;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @author adsupe
 *
 */
public class Transaction {

	private LocalDate transactionDate;
	
	private Integer transactionId;
	
	private Double amount;
	
	private CreditDebit creditDebit;
	
	private Double availableBalance;
	
	private String decription;

	public Transaction(LocalDate transactionDate, Integer transactionId, Double amount, CreditDebit creditDebit,
			Double availableBalance, String decription) {
		super();
		this.transactionDate = transactionDate;
		this.transactionId = transactionId;
		this.amount = amount;
		this.creditDebit = creditDebit;
		this.availableBalance = availableBalance;
		this.decription = decription;
	}

	public LocalDate getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(LocalDate transactionDate) {
		this.transactionDate = transactionDate;
	}

	public Integer getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public CreditDebit getCreditDebit() {
		return creditDebit;
	}

	public void setCreditDebit(CreditDebit creditDebit) {
		this.creditDebit = creditDebit;
	}

	public Double getAvailableBalance() {
		return availableBalance;
	}

	public void setAvailableBalance(Double availableBalance) {
		this.availableBalance = availableBalance;
	}

	public String getDecription() {
		return decription;
	}

	public void setDecription(String decription) {
		this.decription = decription;
	}

	@Override
	public int hashCode() {
		return Objects.hash(transactionId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transaction other = (Transaction) obj;
		return Objects.equals(transactionId, other.transactionId);
	}
	
	
}
