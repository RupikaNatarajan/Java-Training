package com.celcom.saturday_assignments_08_feb_2025;

class Circle {
	int radius;
	
	Circle(int radius){
		this.radius = radius;
	}
	
	
	public int getRadius() {
		return radius;
	}


	public void setRadius(int radius) {
		this.radius = radius;
	}


	void calculateArea(int radius) {
		double area = Math.PI * radius * radius;
		System.out.println("Area of Circle : " + area);
	}
	
	void calculateCircumference(int radius) {
		double circum = 2 * Math.PI * radius;
		System.out.println("Circumference of Circle : " + circum);
	}
}

public class CircleCalculation {
	public static void main(String args[]) {
		Circle circle = new Circle(6);
		System.out.println("Area and Circumference of circle for the radius : " + circle.getRadius());
		circle.calculateArea(circle.getRadius());
		circle.calculateCircumference(circle.getRadius());
		System.out.println();
		
		circle.setRadius(4);
		System.out.println("Area and Circumference of circle for the radius : " + circle.getRadius());
		circle.calculateArea(circle.getRadius());
		circle.calculateCircumference(circle.getRadius());
		
		
	}
}
