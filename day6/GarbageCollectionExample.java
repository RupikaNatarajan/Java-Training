package com.celcom.day6;

public class GarbageCollectionExample {
	
	static int count;
	
	GarbageCollectionExample() {
		count++;
		System.out.println(count);
	}
	
	//Finalize() is a method from object class.It will execute for every garbage collection.
	//If an object is unreferenced ,garbage collection is occured
	protected void finalize() {
		count--;
		System.out.println(count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GarbageCollectionExample obj1 = new GarbageCollectionExample();
		GarbageCollectionExample obj2 = new GarbageCollectionExample();
		
		obj1 = null;  //Here JVM will invoke garbage collection but we dont know when it will call.
		System.gc();  //So we can request using these methods;
		obj2 = null;
		Runtime.getRuntime().gc();
		
		
	}

}
