package com.abstractclass;

public class FullTimeEmployee extends Employee {

	double monthlySalary;

    FullTimeEmployee(String name, int empId, double monthlySalary) {
        super(name, empId);
        this.monthlySalary = monthlySalary;
    }

    double calculateSalary() {
        return monthlySalary;
    }
	
}
