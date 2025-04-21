package com.abstractclass;

public class EmployeeMain {

	 public static void main(String[] args) {
	        Employee emp1 = new FullTimeEmployee("Alice", 101, 50000);
	        Employee emp2 = new PartTimeEmployee("Bob", 102, 80, 200);

	        System.out.println("Full-Time Salary of " + emp1.name + ": ₹" + emp1.calculateSalary());
	        System.out.println("Part-Time Salary of " + emp2.name + ": ₹" + emp2.calculateSalary());
	    }
	
}
