package com.celcom.day6;

import java.util.Scanner;

class VowelNotFoundException extends RuntimeException {
	 
	 public String toString() {
		 return  "Vowel does not present" ;
		 
	 }
}


public class Assignmnt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s1 = sc.next();
		
		int flag = 0;
		for(int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i'
					|| s1.charAt(i) == 'o' || s1.charAt(i) == 'u') {
				flag = 1;
			}
		}
		if(flag == 1) {
			System.out.println("Vowel Present");
		}
		else {
			try {
				throw new VowelNotFoundException(); 
				//By using throw keyword we can throw either pre-defined or
				//user-defined exception.
			}catch(VowelNotFoundException e) {
				System.out.println(e);
			}
			
		}
		

	}

}
