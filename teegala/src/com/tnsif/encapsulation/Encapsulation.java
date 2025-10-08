package com.tnsif.encapsulation;

public class Encapsulation {

	public static void main(String[] args) {
		Encaps ob = new Encaps();
		System.out.println(ob.color);
		System.out.println(ob.seats);
		System.out.println(ob.company);
		
		ob.start();
		ob.stop();

	}

}
