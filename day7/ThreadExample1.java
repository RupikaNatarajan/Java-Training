package com.celcom.day7;

public class ThreadExample1 {
	
	//Main method is the default thread.
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println(t);
		
		System.out.println("Current thread ID : " + t.getId());
		System.out.println("Current thread name : " + t.getName());
		System.out.println("Current thread Priority : " + t.getPriority());

	}

}
