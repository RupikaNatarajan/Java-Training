package com.celcom.day5;

abstract class Vehicle {
	void noOfEngine() {
		System.out.println("I have one engine");
	}
	//Instead of defining an dummy methods we can declare a method.
	abstract void noOfWheels();
	
	abstract void brandName();
}

class Car extends Vehicle {
	void noOfWheels(){
		System.out.println("I have four wheels");
	}
	void brandName(){
		System.out.println("My brand name is Benz");
	}
}

public class AbstractClassExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vec;
		vec = new Car();
		vec.noOfEngine();
		vec.noOfWheels();
		vec.brandName();
		
	}

}
