package com.celcom.saturday_assignments_08_feb_2025;
import java.util.Scanner;

class Rectangle {
	int width;
	int height;
	
	
	void calculateArea(int width, int height) {
		System.out.println("Area of Rectangle : " + (height * width));
	}
	
	void calculatePerimeter(int width, int height) {
		System.out.println("Perimeter of Rectangle : " + 2*(height + width));
	}
}

public class AreaAndPerimeterCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter width and height of Rectangle : ");
		int width = sc.nextInt();
		int height = sc.nextInt();
		
		Rectangle rect = new Rectangle();
		rect.calculateArea(width, height);
		rect.calculatePerimeter(width, height);
		sc.close();
		
		
		
		

	}

}
