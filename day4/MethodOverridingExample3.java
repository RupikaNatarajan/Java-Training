package com.celcom.day4;

class Animal1 {
	int a = 10;
	
	 static void move() {
		 System.out.println("Cannot define");
	 }
	 
}

class Cat1 extends Animal1 {
	int a = 20;
	
	static void move() {
		System.out.println("Cat will move by Walk"); 
	}
	
}

public class MethodOverridingExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal1 animal = new Cat1();
		animal.move();
		System.out.println(animal.a); 
		Cat1.move();
		
		/*
		 * Here line 26 will call the method from Cat class,but animal.a is looking for the variable in Animal class 
		 * because object is for overriding and reference is for non-overriding.
		 * If we remove line 4,then the code will give compile time error at line 27 like a is not defined
		 */

	}

}
