package com.shabbir.assignment;

import com.shabbir.assignment.employees.*;
import com.shabbir.assignment.utilities.*;

public class Main {
	public static void main(String[] args) {
        Manager m = new Manager("Khaleel", 101, 75000, "HR Dept");
        Developer d = new Developer("Saketh", 102, 60000, "Java");

        EmployeeUtil.printEmployeeDetails(m);
        System.out.println("-------------------");
        EmployeeUtil.printEmployeeDetails(d);
    }
}
