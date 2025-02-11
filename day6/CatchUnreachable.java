package com.celcom.day6;

public class CatchUnreachable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Before Exception");
		
		try {
			int arr[] = new int[-2];
		}catch(ArithmeticException e) {
			System.out.println("A");
		}
//		catch(Exception e) {
//			System.out.println("C");
//		}	
		//This code will give compile time error because we must 
		//follow the order of catch block as subtype to supertype.Exception is the 
		//Superclass for all type of exception.so the below code will 
		//become unreachable which means the below code never executes.
		catch(NegativeArraySizeException e) {
			System.out.println("B");
		}catch(Exception e) {
			System.out.println("C");
		}
		
	}

}
