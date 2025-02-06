package com.celcom.day3;

class Vehicle1 { 
	String name = "I am a super class variable";
	
	Vehicle1() {
		System.out.println("I am a super class constructor");
	}
	void noOfEngine() {
		System.out.println("I have One Engine");
	}
	
}

class TwoWheeler1 extends Vehicle1 { 
	TwoWheeler1() {
		super();
		
	}
	void noOfWheels() {
		super.noOfEngine();
		System.out.println("I have two Wheels");
		System.out.println(super.name);
	}
}  


public class SuperKeywordExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoWheeler1 two = new TwoWheeler1();
		two.noOfWheels();
	}

}
