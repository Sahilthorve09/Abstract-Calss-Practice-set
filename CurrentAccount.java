package com.abstractclass;

public class CurrentAccount extends BankAccount {

	double interestRate; // lower or 0

    CurrentAccount(String accountHolder, int accountNumber, double initialBalance, double interestRate) {
        super(accountHolder, accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    double calculateInterest() {
        return balance * (interestRate / 100);
    }
	
}
