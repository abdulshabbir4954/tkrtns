package com.shabbir.assignment.utilities;

import com.shabbir.assignment.employees.*;

public class EmployeeUtil {
	
	public static void printEmployeeDetails(Employee e) {
	        System.out.println("Name: " + e.getName());
	        System.out.println("Employee ID: " + e.getEmployeeId());
	        System.out.println("Salary: " + e.getSalary());
	
	        if (e instanceof Manager) {
	            System.out.println("Department: " + ((Manager) e).getDepartment());
	        } else if (e instanceof Developer) {
	            System.out.println("Programming Language: " + ((Developer) e).getProgLang());
	        }
    }
}
