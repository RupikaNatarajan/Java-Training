package com.celcom.day7;

class MyThread1 implements Runnable {
	public void run() {
		for(int i = 0 ; i <= 5; i++) {
			System.out.println("Thread is Running....");
			//It will make the thread to wait upto 2000ms between each iteration
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ThreadExample3 {

	public static void main(String[] args) throws InterruptedException  {
		//By implementing runnable interface we want to create object in this way
		//ThreadClass reference = new ThreadClass(new ourclass))
		//We are calling thread class constructor using our own class
		
		Thread t1 = new Thread(new MyThread1());
		System.out.println(t1.getState());
		t1.setName("T1"); 
		System.out.println(t1.getName());
		System.out.println(t1.getPriority()); 
		//Upto here one thread is executing (main thread)
		
		t1.start(); //Starting or running my thread
		
		Thread.sleep(3000); //To make the main method to waiting state
		System.out.println("MAIN END");
		t1.suspend();
		System.out.println(t1.getState());
		t1.resume();
		
		
		
	}

}



