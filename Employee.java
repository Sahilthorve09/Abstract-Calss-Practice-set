package com.abstractclass;

public abstract class Employee {

	String name;
    int empId;

    Employee(String name, int empId) {
        this.name = name;
        this.empId = empId;
    }

    abstract double calculateSalary();
	
}
