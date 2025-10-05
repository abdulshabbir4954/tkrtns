package com.tnsif.seven;

public class MultiCatch {
	
	public static void main(String[] args) {
		try{
			int a[]= {20};
			int b=0;
			int c=a[2]/b;
	    	System.out.println(c);
		}
		catch(ArithmeticException e) {
			System.out.println("number cannot be divided");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("index not found");
		}
	}
}