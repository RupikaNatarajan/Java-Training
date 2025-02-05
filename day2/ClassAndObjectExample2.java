package com.celcom.day2;


class Fruits{
	String color;
	int size;
	int price;
	
	Fruits(String color, int size, int price) {
		this.color = color;
		this.size = size;
		this.price = price;
	}
	
	void display() {
		System.out.println("Fruit color : " + color);
		System.out.println("Fruit size : " + size);
		System.out.println("Fruit Price : " + price);
	}
	
	void setPrice(int price) {
		this.price = price;
	}
}

public class ClassAndObjectExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruits apple = new Fruits("Red", 10, 200);
		apple.display();
		apple.setPrice(250);
		apple.display();
	}

}
