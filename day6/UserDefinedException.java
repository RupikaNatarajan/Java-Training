package com.celcom.day6;

import java.util.Scanner;

//We can extends Exception class or any child class of exception 
//based on our requirements.

class InvalidAgeException extends RuntimeException {
	 int age;
	 InvalidAgeException(int age) {
		 this.age = age;
	 }
	 public String toString() {
		 return  age + " - Invalid Age for Voting" ;
		 
	 }
}

public class UserDefinedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.out.println("Enter your age : ");
		int age = new Scanner(System.in).nextInt();
		
		if(age > 18) {
			System.out.println("Welcome to vote");
		}
		else {
			try {
				throw new InvalidAgeException(age); 
				//By using throw keyword we can throw either pre-defined or
				//user-defined exception.
			}catch(InvalidAgeException e) {
				System.out.println(e);
			}
			
		}
	}

}
