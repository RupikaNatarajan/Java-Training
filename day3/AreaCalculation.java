package com.celcom.day3;
import java.util.Scanner;

class Shape {
	int length;
	int breadth;
	float height;
	float radius;
	
	Shape(float radius){
		this.radius = radius;
	}
	
	Shape(int length, int breadth){
		this.length = length;
		this.breadth = breadth;
	}
	Shape(int length, float height){
		this.length = length;
		this.height = height;
	}
	void calculateArea() {
		
	}
}
class Circle extends Shape {
	
	Circle(float radius) {
		super(radius);
	}
	void calculateArea() {
		double area = Math.PI * radius * radius;
		System.out.println("Area of Circle : " + area);
	}
}

class Rectangle extends Shape {
	Rectangle(int length, int breadth) {
		super(length, breadth);
	}
	void calculateArea() {
		int area = length * breadth;
		System.out.println("Area of Rectangle : " + area);
	}
}

class Triangle extends Shape {
	Triangle(int length, float height) {
		super(length, height);
	}
	void calculateArea() {
		double area = 0.5 * (length * height);
		System.out.println("Area of Rectangle : " + area);
	}
	
}


public class AreaCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the choice : ");
		int userInput = sc.nextInt();
		
		if(userInput == 1) {
			System.out.println("Enter the Radius : ");
			float radius = sc.nextFloat();
			Shape shape = new Circle(radius); 
			shape.calculateArea();
		}
		if(userInput == 2) {
			System.out.println("Enter the length and breadth : ");
			int length = sc.nextInt();
			int breadth = sc.nextInt();
			Shape shape = new Rectangle(length, breadth);
			shape.calculateArea();
		}
		if(userInput == 3) {
			System.out.println("Enter the length and height : ");
			int length = sc.nextInt();
			float height = sc.nextInt();
			Shape shape = new Triangle(length, height);
			shape.calculateArea();
		}
		sc.close();

	}

}
