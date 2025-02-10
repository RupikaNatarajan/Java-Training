package com.celcom.saturday_assignments_08_feb_2025;
class Vehicle {
	void drive() {
		System.out.println("We can drive Vehicles");
	}
}

class Car extends Vehicle {
	void drive() {
		System.out.println("Reparing a car");
	}
}

public class OverrideExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle = new Car();
		vehicle.drive();

	}

}
