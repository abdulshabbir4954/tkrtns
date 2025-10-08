package com.tnsif.eight;

class myThread extends Thread {
	String threadName;

    myThread(String name) {
        threadName = name;
    }

    public void run() {
        try {
            System.out.println(threadName + " started.");
            Thread.sleep(1000); // Simulate some work
            System.out.println(threadName + " finished.");
        } catch (InterruptedException e) {
            System.out.println(threadName + " interrupted.");
        }
    }
}
