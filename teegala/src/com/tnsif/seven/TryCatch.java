package com.tnsif.seven;

public class TryCatch {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		try {
			System.out.println(arr[5]);
		}
		catch(Exception e) {
			System.out.println("Enter a valid index : ");
		}
	}

}
