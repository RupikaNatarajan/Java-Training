package com.celcom.day1;
import java.util.Scanner;

public class CalculatorApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("Enter number1 and number2");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			System.out.println("Choose any number from the menu");
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("5.Quit/Exit");
			choice = sc.nextInt();
			
		
			switch(choice) {
				case 1:
					System.out.println("Addition : " + num1 + num2);
					break;
				case 2:
					System.out.println("Subtraction : " + (num1 - num2));
					break;
				case 3:
					System.out.println("Multiplication : " + num1 * num2);
					break;
				case 4:
					System.out.println("Division : " + num1 / num2);
					break;
				case 5:
					System.out.println("Quit");
					break;	
				default:
					System.out.println("Enter the choice from the menu");
			}
		}while(choice != 5);
		sc.close();
	}

}
