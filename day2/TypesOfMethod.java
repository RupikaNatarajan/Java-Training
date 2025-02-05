package com.celcom.day2;

public class TypesOfMethod {
	
	void m1() {
		System.out.println("Instance Method");
	}
	
	static void m2() {
		System.out.println("Static Method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TypesOfMethod obj = new TypesOfMethod(); //Object created to access instance method
		obj.m1();					
		
		TypesOfMethod.m2();    //No need of object to call static method
	}

}
