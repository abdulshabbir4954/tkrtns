package com.tnsif.eight;

public class Main {

	public static void main(String[] args) {
		for(int i =0;i<3;i++) {
		Joinmethod obj = new Joinmethod(i);
		Thread myThread = new Thread(obj);
		myThread.start();
		try {
			myThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}

	}

}
