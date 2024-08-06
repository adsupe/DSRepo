package com.cg;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author adsupe
 *
 */
public class BankingOperation {

	private List<Customer> customers;
	
	private Double INITIAL_BALANCE = 10000.00;
	
//	private Map<Integer,List<Transaction>> transactionMap;
	
//	private Map<Integer,Customer> customerMap;
	
	private AtomicInteger count = new AtomicInteger(1);
	
	public BankingOperation() {
		this.customers = new ArrayList<Customer>();
//		this.transactionMap = new HashMap<Integer,List<Transaction>>();
		
		Customer customer = new Customer("Ram",777,"SAVING",INITIAL_BALANCE);
		Transaction t1 = new Transaction(LocalDate.now(), count.getAndIncrement(), INITIAL_BALANCE, CreditDebit.CR, INITIAL_BALANCE, "New Account");
		List<Transaction> transactions = new ArrayList<Transaction>();
		transactions.add(t1);
		customer.setTransactions(transactions);
		
		
		customers.add(customer);
//		customerMap.put(777, customer);
//		this.transactionMap = customers.stream().collect(Collectors.toMap(Customer::getAccountNumber, Customer::getTransactions));
		
	}
	
	public void withdrawMoney(double amount) {
		Customer customer = customers.get(0);
		if (amount <= 0) {
            System.out.println("Invalid amount. Please enter amount greater than zero.");
        } else if (amount > customer.getAvailableBalance()) {
            System.out.println("Insufficient balance. Transaction failed.");
        } else {
			double balance = customer.getAvailableBalance() - amount;
			Transaction t1 = new Transaction(LocalDate.now(), count.getAndIncrement(), amount, CreditDebit.DR, balance, "Withdraw");
			List<Transaction> transactions = customer.getTransactions();
			transactions.add(t1);
			customer.setTransactions(transactions);
			customer.setAvailableBalance(balance);
			System.out.println("After amount "+amount+" withdrwal remaining balance :: " + balance);
		} 
	}
	
	
	public void depositMoney(double amount) {
		Customer customer = customers.get(0);
		double balance = customer.getAvailableBalance() + amount;
		Transaction t1 = new Transaction(LocalDate.now(), count.getAndIncrement(), amount, CreditDebit.CR, balance, "Deposit");
		List<Transaction> transactions = customer.getTransactions();
		transactions.add(t1);
		customer.setTransactions(transactions);
		customer.setAvailableBalance(balance);
		System.out.println("Amount "+amount+" deposited successfully, current balance: " + balance);
	}
	
	public void transferFunds(double amount) {
		Customer customer = customers.get(0);
		if (amount < customer.getAvailableBalance()) {
			double balance = customer.getAvailableBalance() - amount;
			Transaction t1 = new Transaction(LocalDate.now(), count.getAndIncrement(), amount, CreditDebit.DR, balance, "Transfer");
			List<Transaction> transactions = customer.getTransactions();
			transactions.add(t1);
			customer.setTransactions(transactions);
			customer.setAvailableBalance(balance);
			System.out.println("Amount "+amount+" Transfered successfully & remaining balance :: " + balance);
        } else {
            System.out.println("Insufficient balance. Transfer failed.");
        }
	}
	
	public List<Transaction> displayTransactions() {
		Customer customer = customers.get(0);
		return customer.getTransactions();
	}
	
	public Double showBalance() {
		Customer customer = customers.get(0);
		return customer.getAvailableBalance();
	}
	
}
