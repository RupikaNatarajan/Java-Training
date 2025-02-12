package com.celcom.day7;

class Resource1 {
	private String data;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	
}

class Reader extends Thread {
	Resource1 resource1;
	
	Reader(Resource1 resource1){
		this.resource1 = resource1;
	}
	
	public void run() {
		synchronized (resource1) {
			System.out.println("Reader is waiting for the writer to write the data...");
		
		try {
			resource1.wait();
		} catch (InterruptedException e) {}
		System.out.println("Data from Reader : " + resource1.getData());
	}
	}
}

class Writer extends Thread {
	Resource1 resource1;
	
	Writer(Resource1 resource1){
		this.resource1 = resource1;
	}
	
	public void run() {
		synchronized(resource1) {
			System.out.println("Writer is writing the data...");
			resource1.setData("Hello Reader..");
			resource1.notify();
		}
	}
}

public class ThreadExample6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Resource1 resource1 = new Resource1();
		
		Reader reader = new Reader(resource1);
		reader.start();
		
		Thread.sleep(2000);
		
		Writer writer = new Writer(resource1);
		writer.start();
		
		
	}

}
