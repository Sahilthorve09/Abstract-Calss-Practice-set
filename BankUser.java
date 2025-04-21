package com.abstractclass;

public class BankUser {

	public static void main(String[] args) {
        BankAccount savings = new SavingsAccount("Ravi Kumar", 1001, 10000, 5.0);
        BankAccount current = new CurrentAccount("Anita Mehra", 1002, 20000, 2.0);

        savings.deposit(2000);
        savings.withdraw(1500);
        System.out.println("Interest for Savings: ₹" + savings.calculateInterest());

        current.deposit(3000);
        current.withdraw(5000);
        System.out.println("Interest for Current: ₹" + current.calculateInterest());
    }
	
}
