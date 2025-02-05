package com.celcom.day2;

public class TypesOfVariables {
	int b=20;         //Instance or Object variables
	static int c=30;  //static or class variables 
	
	public static void main(String[] args) {
		int a=10;    //Local variable
		System.out.println(a);
		
		TypesOfVariables obj = new TypesOfVariables();   //To access instance variable
		System.out.println(obj.b);
		 
		System.out.println(TypesOfVariables.c);          //To access static variables classname.variablename
		
	}
	
	
	
	
	
}
