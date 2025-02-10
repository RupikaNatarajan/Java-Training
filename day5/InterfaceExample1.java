package com.celcom.day5;

//Interface
interface VehiclePlan1 {
	/*By default all the interface methods are public abstract.
	 * So abstract keyword is optional.
	 * This is not a class so there is no constructor,no definition,no static methods,
	 * 
	 */
	
	void noOfEngine();
	void noOfWheels();
	void brandName();
}


interface VehiclePlan2 {
	void noOfWheels();
	void brandName();
}


//Abstract class
//A class can implements n number of interfaces.
abstract class Vehicle1 implements VehiclePlan1,VehiclePlan2 {
	public void noOfEngine() {
		System.out.println("I have one Engine");
	}
}

class Car1 extends Vehicle1 {
	public void noOfWheels() {
		System.out.println("I have Four Wheels");
	}
	public void brandName() {
		System.out.println("My brand name is Benz");
	}
}



public class InterfaceExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VehiclePlan1 vec = new Car1();
		vec.noOfEngine();
		vec.noOfWheels();
		vec.brandName();

	}

}
