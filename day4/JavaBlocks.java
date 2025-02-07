package com.celcom.day4;

/*
 *
 * Static Block will execute before the application starts.
 * 
 * For every object creation ,java will execute three things
 * 		- Instance Block
 * 		- Constructor
 * 		- toString() method from object class
 * 
 * Here we didn't call the toString() method anywhere even it will execute and provide output because for every object
 * creation the above three things will execute automatically. And it execute in the above order.Firt - Instance block,
 * next Constructor and then toString() method.
 */



public class JavaBlocks {
	
	{
		System.out.println("Instance Block");
	}
	
	public String toString() {
		 return "ToString";
	}
	
	JavaBlocks() {
		System.out.println("Constructor");
	}
	
	static { 
		System.out.println("Static Block");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("MainMethod Block");
		
		JavaBlocks block = new JavaBlocks();
		System.out.println(block);
		

	}

}


