package com.celcom.day5;

interface Example1{
	int a = 10; // By default interface variables are public static and final
	
}

interface Example2 {
	int a = 20;
}

interface Example3 extends Example1,Example2 { 
	void addition();
}

class Addition implements Example3 {
	
	public void addition() {
		
		System.out.println("Sum of Two numbers : " + (Example1.a+Example2.a));
	}
}

public class MultipleInheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example3 example = new Addition();
		example.addition();

	}

}
