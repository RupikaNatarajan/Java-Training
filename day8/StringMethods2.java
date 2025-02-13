package com.celcom.day8;

public class StringMethods2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Java";
		
		for(int i = 0; i < s1.length(); i++) {
			System.out.print(s1.charAt(i));
		}
		System.out.println();
		char ch[] = s1.toCharArray(); //We can traverse character array either by for loop or by for each loop
		for(char c : ch) {
			System.out.print(c);
		}
		System.out.println();
		String s2 = "Welcome to Java Programming";
		String temp[] = s2.split(" ");
		
		for(String s : temp) {
			System.out.print(s + " ");
		}
	}

}
