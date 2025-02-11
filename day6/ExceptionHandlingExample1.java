package com.celcom.day6;

public class ExceptionHandlingExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Before Exception");
		
		//int a = 10 / 0; 	       		java.lang.ArithmeticException
		
		//int arr[] = new int[-4];      java.lang.NegativeArraySizeException
		
		//int a[] = {10, 20};
		//System.out.println(a[3]); 	java.lang.ArrayIndexOutOfBoundsException
		
		int a = Integer.parseInt("123");
		//int b = Integer.parseInt("ABC");	java.lang.NumberFormatException
		
		ExceptionHandlingExample1  o = (ExceptionHandlingExample1) new Object();
		//java.lang.ClassCastException   . We cannot assign superclass to subclass object.
		
		System.out.println("Before Exception");
	}

}
