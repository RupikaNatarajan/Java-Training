package com.celcom.day4;

class Vehicle {
	void engine() {
		System.out.println("All Vehicle has a One Engine");
	}
	
	void wheels() {
		System.out.println("All vehicle has a Wheels");
	}
}

class Wheels {
	void wheelModel() {
		System.out.println("Wheel model is MRF");
	}
	
	void noOfWheels(String vehicleType) {
		if(vehicleType.equals("Two Wheeler")) {
			System.out.println("I have two wheels");
		}
		
		else if(vehicleType.equals("Four Wheeler")) {
			System.out.println("I have four wheels");
		}
	}
	

}

class Engine {
	void engineModel() {
		System.out.println("Engine model is XYZ");
	}
}

class Car extends Vehicle { //IS-A
	Wheels wheel = new Wheels(); //HAS-A
	Engine engine = new Engine(); //HAS-A
	
	/* 
	 * HAS-A -> The required class object is declared within the another(inherited) class.
	 */
	
	void engineModel() {
		engine.engineModel();
	}
	
	void wheelModel() {
		wheel.wheelModel();
	}
	
	void noOfWheels() {
		wheel.noOfWheels("Four Wheeler");
	}
}


public class IsAHasAExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		car.engine();
		car.engineModel();
		
		car.wheels();
		car.wheelModel();
		car.noOfWheels();
	}

}
