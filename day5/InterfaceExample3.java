package com.celcom.day5;

import java.util.Scanner;

interface Area {
	void calculateArea();
}

interface Perimeter {
	void calculatePerimeter();
}

abstract class Shape implements Area,Perimeter {
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
	//public abstract void calculateArea();
	
}
class Circle extends Shape {
	
	Circle(float radius) {
		super(radius);
	}
	public void calculateArea() {
		double area = Math.PI * radius * radius;
		System.out.println("Area of Circle : " + area);
	}
	public void calculatePerimeter() {
		System.out.println("Perimeter of Circle : " + (2 * Math.PI * radius));
	}
	
	
}

class Rectangle extends Shape {
	Rectangle(int length, int breadth) {
		super(length, breadth);
	}
	public void calculateArea() {
		int area = length * breadth;
		System.out.println("Area of Rectangle : " + area);
	}
	public void calculatePerimeter() {
		System.out.println("Perimeter of Rectangle : " + (2)*(length+breadth));
	}
}

class Triangle extends Shape {
	Triangle(int length, float height) {
		super(length, height);
	}
	public void calculateArea() {
		double area = 0.5 * (length * height);
		System.out.println("Area of Triangle : " + area);
	}
	public void calculatePerimeter() {
		System.out.println("Perimeter of Triangle : " + (3 * height));
	}
	
}


public class InterfaceExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Enter the choice : ");
			int userInput = sc.nextInt();
		
			if(userInput == 1) {
				System.out.println("Enter the Radius : ");
				float radius = sc.nextFloat();
				//We cannot create object to interface as well as abstract class.
				//So we can create reference to interface or abstract class to assign 
				//subclass object.
				Shape shape = new Circle(radius); 
				shape.calculateArea();
				shape.calculatePerimeter();
			}
			else if(userInput == 2) {
				System.out.println("Enter the length and breadth : ");
				int length = sc.nextInt();
				int breadth = sc.nextInt();
				Shape shape = new Rectangle(length, breadth);
				shape.calculateArea();
				shape.calculatePerimeter();
			}
			else if(userInput == 3) {
				System.out.println("Enter the length and height : ");
				int length = sc.nextInt();
				float height = sc.nextFloat();
				Shape shape = new Triangle(length, height);
				shape.calculateArea();
				shape.calculatePerimeter();
			}
			else {
				System.out.println("Enter the choice between 1 and 3");
				break;
			}
		}
		

	}

}
