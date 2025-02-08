package com.celcom.assignments;

class Dog { 
	String name;
	String breed;
	
	Dog(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	
	
}

public class DogExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog1 = new Dog("A", "Labrador");
		Dog dog2 = new Dog("B", "Boxer");
		
		
		System.out.println("Initial Values");
		System.out.println("Name of Dog1 : " + dog1.getName());
		System.out.println("Breed of Dog1 : " + dog1.getBreed());
		
		System.out.println("Name of Dog2 : " + dog2.getName());
		System.out.println("Breed of Dog2 : " + dog2.getBreed());
		
		dog1.setName("AA");
		dog1.setBreed("Doberman");
		
		dog2.setName("BB");
		dog2.setBreed("German Shepherd");
		
		System.out.println("Updated Values");
		System.out.println("Name of Dog1 : " + dog1.getName());
		System.out.println("Breed of Dog1 : "  + dog1.getBreed());
		
		System.out.println("Name of Dog2 : " + dog2.getName());
		System.out.println("Breed of Dog2 : " + dog2.getBreed());
		
		
		
	}

}
