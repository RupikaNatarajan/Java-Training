package com.celcom.day4;

public class MethodOverloadingExample3 {
	
	void concat(String s1, String s2) {
		System.out.println("Concatenation of two strings : " + s1 + s2);
	}
	
	void concat(int num1, int num2) {
		System.out.println("Concatenation of two Integers : " + num1 + num2);
	}
	
	void concat(double num1, double num2) {
		System.out.println("Concatenation of two Double values : " + num1 + num2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingExample3 obj = new MethodOverloadingExample3();
		obj.concat(10.5, 20.5);
		obj.concat(10, 20);
		obj.concat("Java","Training");

	}

}
