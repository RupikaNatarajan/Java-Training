package com.celcom.day3;

class Vehicle11 {
	
}

class Bike1 extends Vehicle11 {

}

class Car1 extends Vehicle11 {
	
}

/* Using Dynamic Method Dispatch we can create reference for super class and dynamically assign different super class objects.
 * One reference can point different objects.
 * Without Inheritance we cannot use DMD,Inheritance is the base for DMD.
 * EX.one person providing service for different customers like mechanic provide a service for auto,bike,bus and soon..
 */
public class DMD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle11 vec = new Bike1();   //DMD
		
		vec = new Car1();
	}

}
