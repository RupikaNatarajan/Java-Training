package com.celcom.assignments;
import java.util.Scanner;

class Shape {
	int length;
	int width;
	
	Shape(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	void getArea() {
		System.out.println("Calculating Area..");
	}
}

class Rectangle1 extends Shape {

	Rectangle1(int length, int width) {
		super(length, width);
	}
	void getArea() {
		System.out.println("Area of Rectangle : " + (length * width));
	}
}

public class OverrideExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length and width of the rectangle : ");
		int length = sc.nextInt();
		int width = sc.nextInt();
		
		Shape shape = new Rectangle1(length, width);
		shape.getArea();
		sc.close();
		
		
		

	}

}
