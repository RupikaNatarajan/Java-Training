package com.celcom.day8;

//Ways to create a String Objects in Java.
public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.Directly assign literals
		String s1 = "Hello";
		
		//2.By using new Keyword
		String s2 = new String("Java");
		
		//3.By converting character array to string. 
		char ch[] = {'H', 'i'};
		String s3 = new String(ch);
		

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}

}
