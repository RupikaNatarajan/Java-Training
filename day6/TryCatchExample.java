package com.celcom.day6;

public class TryCatchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Before Exception");
		
		try {
			//int a = 10 / 0;
			//int b = Integer.parseInt("ABC");
			//int arr[] = new int[-2];   
			// Even we have try block but the relevant catch block is 
			//not defined so the code will through an exception and terminate abnormally.
		}catch(ArithmeticException e) {
			System.out.println("A");
		}catch(NumberFormatException e) {
			System.out.println("B");
		}
		
		//A try block can come with multiple catch blocks,but the code will execute 
		//only the relevant catch block to handle/catch the exception.
		
		
		try {
			 int arr[] = new int[-2];
			 System.out.println("Hi"); 
			 //This statement cannot be executed,because when the exception arises 
			 //the control cn come out of try block to handle the exception.
			 //It doesnot goes back to try block.
			 //If the exception is handled with the relevant catch block the exception
			 //can be handled and the code execution will continue.
			 //Otherwise the code throw an error and terminate abnormally.
		}catch(NegativeArraySizeException e) {
			System.out.println(e);
		}
		System.out.println("After Exception");
	}

}
