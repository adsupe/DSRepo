package com.cg;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author adsupe
 *
 * Adarsh Supe - Banking Server App Demo
 */
public class BankingDemoApp {

	private static BankingOperation bankingOperation;
	
	public static void initOperation() {
		bankingOperation = new BankingOperation();
		System.out.println("Initializing Few Transactions in Banking Server App....");
		bankingOperation.depositMoney(2000.00);
		bankingOperation.depositMoney(500);
		bankingOperation.depositMoney(100.00);
		bankingOperation.depositMoney(100);
		bankingOperation.depositMoney(100.00);
		bankingOperation.withdrawMoney(600);
		bankingOperation.depositMoney(300);
		bankingOperation.withdrawMoney(400);
		bankingOperation.withdrawMoney(200);
	}

	public static void main(String[] args) {
		
		initOperation();
		Scanner scanner = new Scanner(System.in);

		while(true) {
			System.out.println("-----------------------");
			System.out.println(" Banking Server App ");
			System.out.println("-----------------------");
			System.out.println("1. Deposit Amount");
			System.out.println("2. Withdraw Amount");
			System.out.println("3. Transfer Amount");
			System.out.println("4. Display Transactions Details");
			System.out.println("5. Show Balance");
			System.out.println("6. Exit");
			System.out.print("Enter your choice: ");

			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			
			case 1:
				depositAmount(scanner);
				break;
			case 2:
				withdrawAmount(scanner);
				break;
			case 3:
				transferFunds(scanner);
				break;
			case 4:
				displayTransactions();
				break;
			case 5:
				showBalance();
				break;
			case 6:
				System.out.println("Thank you for using the Banking Server App.");
						return;
			default:
				System.out.println("Invalid choice. Kindly select again.");

			}
		}
	}
	
	
	private static void depositAmount(Scanner scanner) {
		System.out.println("Enter Amount to Deposit :: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); 
        bankingOperation.depositMoney(amount);
	}
	
	private static void withdrawAmount(Scanner scanner) {
		System.out.println("Enter Amount to Withdraw :: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        bankingOperation.withdrawMoney(amount);
	}
	
	private static void transferFunds(Scanner scanner) {
		System.out.println("Enter Amount to Transfer :: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        bankingOperation.transferFunds(amount);
	}
	
	private static void displayTransactions() {
		List<Transaction> transactionList =  
				bankingOperation.displayTransactions().
				stream().
				sorted(Comparator.comparingInt(Transaction::getTransactionId)).collect(Collectors.toList());
		System.out.println("Date\t Transaction ID Amount Cr/Dr Available Balance Desciption");
		int skip = 0;
		if(transactionList.size() > 10) {
			skip = transactionList.size() - 10;
		}
		transactionList.stream().skip(skip).
		forEach(i->System.out.println(i.getTransactionDate()+"\t"+i.getTransactionId()+"\t"+i.getAmount()+"\t"+i.getCreditDebit()+"\t"+i.getAvailableBalance()+"\t\t"+i.getDecription()));
		
	}
	
	private static void showBalance() {
		System.out.println("Current Balance :: "+bankingOperation.showBalance());
	}
}
