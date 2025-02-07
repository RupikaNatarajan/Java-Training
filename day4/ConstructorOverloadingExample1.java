package com.celcom.day4;

public class ConstructorOverloadingExample1 {

		
	   ConstructorOverloadingExample1(String s1, String s2) {
			System.out.println("Concatenation of two strings : " + s1 + s2);
		}
		
	   ConstructorOverloadingExample1(int num1, int num2) {
		   	this(10.5,12.5);
			System.out.println("Concatenation of two Integers : " + num1 + num2);
		}
		
	   ConstructorOverloadingExample1(double num1, double num2) {
		    this("Java","Training");
			System.out.println("Concatenation of two Double values : " + num1 + num2);
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
//			ConstructorOverloadingExample1 obj1 = new ConstructorOverloadingExample1("Java","Training");
			ConstructorOverloadingExample1 obj2 = new ConstructorOverloadingExample1(10,25);
//			ConstructorOverloadingExample1 obj3 = new ConstructorOverloadingExample1(10.5,20.0);
			
			
			/*Instead of creating multiple objects we can use this keyword
			 * to call other constructors
			 */
			
			


		} 

}
