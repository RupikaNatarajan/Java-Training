package com.celcom.day7;

class TwoTable extends Thread {
	public void run() {
		for(int i = 1; i <= 10; i++) {
			System.out.println(i + "* 2 = " + (i * 2));
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
		}
	}
}

class TenTable implements Runnable {
	public void run() {
		for(int i = 1; i <= 10; i++) {
			System.err.println(i + "* 10 = " + (i * 10));
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
		}
	}
}

public class ThreadExample5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		TwoTable two = new TwoTable();
		Thread ten = new Thread(new TenTable());
		
		two.start();
		System.out.println("Main 1");
		two.join(); //join() can suspend the current thread , join method is written
		//in main method so main thread will wait until the completion of invoking 
		//thread.Here the invoking thread is two.
		System.out.println("Main 2");
		
		ten.start();
	
	}

}
