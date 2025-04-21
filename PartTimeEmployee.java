package com.abstractclass;

public class PartTimeEmployee extends Employee {

	 int hoursWorked;
	    double ratePerHour;

	    PartTimeEmployee(String name, int empId, int hoursWorked, double ratePerHour) {
	        super(name, empId);
	        this.hoursWorked = hoursWorked;
	        this.ratePerHour = ratePerHour;
	    }

	    double calculateSalary() {
	        return hoursWorked * ratePerHour;
	    }
	
}
