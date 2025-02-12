package com.celcom.day7;

class MyThread extends Thread {
	public void run() {
		for(int i = 0 ; i <= 5; i++) {
			System.out.println("My Thread Running....");
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

public class ThreadExample2 {

	public static void main(String[] args) throws InterruptedException  {
		MyThread t1 = new MyThread();
		System.out.println(t1.getState());
		t1.setName("T1");
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		//Upto here one thread is executing (main thread)
		
		t1.start(); //Starting or running my thread
		
		Thread.sleep(3000); //To make the main method to waiting state
		System.out.println("MAIN END");
		
	}

}
