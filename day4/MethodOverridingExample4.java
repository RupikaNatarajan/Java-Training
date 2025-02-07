package com.celcom.day4;

class A {
	String msg = getMessage();
	
	String getMessage() {
		return "A";
	}
}

class B extends A{
	String getMessage() {
		return "B";
	}
}

public class MethodOverridingExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new B();
		System.out.println(a.msg);

	}
	
	/* This code will give output as 'B'. Because there is no matter from where we are calling the method.
	 * Method must be overridden even we call variable also . Because Object is created for B class.
	 */
}
