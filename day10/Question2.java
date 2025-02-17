package com.celcom.day10;

class Resource1 {
	private String data;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	
}

class Consumer extends Thread{
	Resource1 resource;
	
	Consumer(Resource1 resource){
		this.resource = resource;
	}
	public void run() {
		synchronized (resource) {
			System.out.println("Consumer is waiting for Producer to produce the data...");
		
		try {
			resource.wait();
		} catch (InterruptedException e) {}
		System.out.println("Consumer consuming the data : " + resource.getData());
	}
	}
	
}


class Producer extends Thread{
	Resource1 resource;
	
	Producer(Resource1 resource){
		this.resource = resource;
	}
	public void run() {
		synchronized(resource) {
			System.out.println("Producer Producing the data");
			resource.setData("Hello Developer...");
			resource.notify();
		}
	}
	
}

public class Question2 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		Resource1 resource = new Resource1();
		
		Consumer consume = new Consumer(resource);
		consume.start();
		
		Thread.sleep(2000);
		
		Producer produce = new Producer(resource);
		produce.start();

	}

}
