package com.celcom.day8;


//String class methods
public class StringMethods1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Java";
		
		System.out.println(s1.length());       	//4
		System.out.println(s1.charAt(1));      	//a
		
		System.out.println(s1.toLowerCase());  	//java
		System.out.println(s1.toUpperCase());	//JAVA
		
		System.out.println(s1.concat(" World"));//Java World
		System.out.println(s1.replace('a', 'z'));//Jzvz
		
		System.out.println(s1.equals("java")); 	//false
		System.out.println(s1.equalsIgnoreCase("java")); //true
		
		System.out.println(s1.contains("av")); //true
		System.out.println(s1.startsWith("Jv")); //false
		System.out.println(s1.endsWith("va"));  //true
		
		String s2 = "Java World";
		System.out.println(s2.substring(2,7)); //va Wo
		System.out.println(s2.substring(2)); //va World
	}

}
