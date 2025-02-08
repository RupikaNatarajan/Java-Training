package com.celcom.assignments;

class Animal {
	void makeSound() {
		System.out.println("All animals can make sound");
	}
}

class Cat extends Animal {
	void makeSound() {
		System.out.println("Cat can bark");
	}
}

public class OverrideExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Cat();
		animal.makeSound();
	}

}
