package com.celcom.day7;

public class ThreadCreationByAnonymousInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Using Anonymous Inner Class -> A class without name
		Runnable runnable = new Runnable() {
			public void run() {
				for(int i = 1; i <= 5; i++) {
					System.out.println("Thread t1 is running..");
					
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
		
					}
				}
			}
		};
		Thread t1 = new Thread(runnable);
		t1.start();
		
		
		//Using Lambda Expression -> A class without name and method name.
		Runnable runnable1 = () -> {
			for(int i = 1; i <= 5; i++) {
				System.err.println("Thread t2 is running..");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
	
				}
			}
		};
		Thread t2 = new Thread(runnable1);
		t2.start();
		
		
	}

}
