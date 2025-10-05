package com.tnsif.six.Wrapper;

public class AutoUnBox1 {

	public static void main(String[] args) {
		Integer x = 50;      // Wrapper class
        int y = x;           // auto-unboxing
        System.out.println("Wrapper Integer: " + x);
        System.out.println("Primitive int: " + y);

	}

}
