package com.celcom.day9;

public class WrapperClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		Integer obj1 = new Integer(a); //Boxing
		int b = obj1.intValue(); //Un-Boxing
		
		//From JDK 1.5 we can directly convert primitive into object without using "new" keyword.
		Integer obj2 = a; //Auto Boxing
		int c = obj2;	//Auto Un-boxing

	}

}
