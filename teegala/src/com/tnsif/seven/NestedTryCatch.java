package com.tnsif.seven;

public class NestedTryCatch {

	public static void main(String[] args) {
		try {
		
		try {
			int ar[]= {1,2,3,4,5};
			System.out.println(ar[7]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("index not found");
		}	
	}
	catch(Exception e) {
		System.out.println("got an another exception");
	}

	}

}
