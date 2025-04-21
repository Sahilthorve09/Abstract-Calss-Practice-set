package com.abstractclass;

public class SavingsAccount extends BankAccount {

	double interestRate; // e.g., 5% annually

    SavingsAccount(String accountHolder, int accountNumber, double initialBalance, double interestRate) {
        super(accountHolder, accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    double calculateInterest() {
        return balance * (interestRate / 100);
    }
	
}
