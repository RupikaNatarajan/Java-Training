package com.celcom.day4;

 

public class MethodOverloadingExample {
	
	void myMethod(int a) {
		int fact = 1;
		for(int i = 1; i <= a; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial : " + fact);
	}
	
	void myMethod(int a, int b) {
		int sum = a + b;
		System.out.println("Sum : " + sum);
	}
	
	 void myMethod(String name) {
		System.out.println("Welcome " + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingExample obj = new MethodOverloadingExample();
		obj.myMethod(5,15);
		obj.myMethod("Rupika");
		obj.myMethod(5);

	}

}
