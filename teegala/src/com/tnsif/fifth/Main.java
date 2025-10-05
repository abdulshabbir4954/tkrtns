package com.tnsif.fifth;

public class Main {

	public static void main(String[] args) {
		GetandSet ob = new GetandSet();

        ob.setName("Rahul");
        ob.setAge(21);

        System.out.println("Name: " + ob.getName());
        System.out.println("Age: " + ob.getAge());
	}

}
