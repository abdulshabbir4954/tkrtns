package com.tnsif.six.Wrapper;

public class AutoBox2 {

	public static void main(String[] args) {
		double d = 45.67;      // primitive double
        Double obj = d;        // autoboxing
        System.out.println("Primitive double: " + d);
        System.out.println("Wrapper Double: " + obj);
	}

}
