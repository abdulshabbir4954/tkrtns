package com.shabbir.assignment.employees;

public class Developer extends Employee{
	private String progLang;

    public Developer(String name, int employeeId, double salary, String progLang) {
        super(name, employeeId, salary);
        this.progLang = progLang;
    }

    public String getProgLang() { return progLang; }
    public void setProgLang(String progLang) { this.progLang = progLang; 
    }
}
