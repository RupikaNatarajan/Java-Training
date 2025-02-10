package com.celcom.saturday_assignments_08_feb_2025;

class Person {
	String name;
	int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void printInfo() {
		System.out.println("Person Name : " + name);
		System.out.println("Person's age : " + age);
	}
}

public class PersonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1 = new Person("Rupika",21);
		person1.printInfo();
		
		Person person2 = new Person("Kavya",25);
		person2.printInfo();
		
		
	}

}
