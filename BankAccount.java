package com.abstractclass;

public abstract class BankAccount {

	 String accountHolder;
	    int accountNumber;
	    double balance;

	    BankAccount(String accountHolder, int accountNumber, double initialBalance) {
	        this.accountHolder = accountHolder;
	        this.accountNumber = accountNumber;
	        this.balance = initialBalance;
	    }

	    void deposit(double amount) {
	        balance += amount;
	        System.out.println("Deposited ₹" + amount + ". New Balance: ₹" + balance);
	    }

	    void withdraw(double amount) {
	        if (amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawn ₹" + amount + ". Remaining Balance: ₹" + balance);
	        } else {
	            System.out.println("Insufficient balance.");
	        }
	    }

	    abstract double calculateInterest();
	
}
