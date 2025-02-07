package com.celcom.day4;

class Animal {
	 void move() {
		 System.out.println("Cannot define");
	 }
	 void eat() {
		 System.out.println("Cannot define");
	 }
}

class Cat extends Animal {
	void move() {
		System.out.println("Cat will move by Walk"); 
	}
	void eat() {
		System.out.println("Cat will eat Rat");
	}
}

class Parrot extends Animal {
	void move() {
		System.out.println("Parrot will move by Fly");
	}
	void eat() {
		System.out.println("Parrot will eat Fruits");
	}
}

class Fish extends Animal {
	void move() {
		System.out.println("Fish will move by Swim");
	}
	void eat() {
		System.out.println("Fish will eat SeaPlants");
	}
}


public class MethodOverridingExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal;
		
		animal = new Cat();
		animal.move();
		animal.eat();
		
		animal = new Parrot();    
		animal.move();
		animal.eat();
		
		animal = new Fish();
		animal.move();
		animal.eat();
		
	}

}
