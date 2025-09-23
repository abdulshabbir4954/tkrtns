package com.tnsif.four;

public class ConsOverload {
	 String name;
	    int age;
	    double marks;

	    // Default constructor
	    ConsOverload() {
	        name = "Unknown";
	        age = 0;
	        marks = 0.0;
	    }

	    // Constructor with 1 parameter
	    ConsOverload(String n) {
	        name = n;
	        age = 0;
	        marks = 0.0;
	    }

	    // Constructor with 2 parameters
	    ConsOverload(String n, int a) {
	        name = n;
	        age = a;
	        marks = 40.0;
	    }

	    // Constructor with 3 parameters (different sequence/type possible)
	    ConsOverload(int a, String n, double m) {
	        name = n;
	        age = a;
	        marks = m;
	    }

	    void display() {
	        System.out.println("Name: " + name + ", Age: " + age + ", Marks: " + marks);
	    }

	public static void main(String[] args) {
		ConsOverload s1 = new ConsOverload();
		ConsOverload s2 = new ConsOverload("Esther");
		ConsOverload s3 = new ConsOverload("Ronny", 20);
		ConsOverload s4 = new ConsOverload(22, "Charlie", 88.5);

        s1.display();
        s2.display();
        s3.display();
        s4.display();
	}

}
