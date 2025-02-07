package com.celcom.day4;

class SuperClass {
	void myMethod() {
		System.out.println("I am from SuperClass");
	}
}

class SubClass extends SuperClass { 
	void myMethod() {
		System.out.println("I am from SubClass");
	}
}


public class MethodOverridingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass obj = new SubClass();
		obj.myMethod();
		
		SuperClass obj1 = new SubClass();   //DMD
		obj1.myMethod();
		
		/*Compiler will identify overriding method based on object.Objects are created during runtime so method
		 * overloading is runtime polymorphism
		 */
		
		
	}

}
