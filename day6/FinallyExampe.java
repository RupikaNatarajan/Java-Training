package com.celcom.day6;

public class FinallyExampe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before Exception");
		
		try {
			int a = 10 / 0;
		}catch(ArithmeticException e) {
			System.out.println("A");
		}catch (NumberFormatException e) {
			System.out.println("B");
		}catch (NegativeArraySizeException e) {
			System.out.println("C");
		}finally {
			System.out.println("Inside Finally");
		}
		
		System.out.println("After Execution");

	}

}
