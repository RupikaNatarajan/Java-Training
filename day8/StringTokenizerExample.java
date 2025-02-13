package com.celcom.day8;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Welcome to Java Programming";
		StringTokenizer st = new StringTokenizer(s1, " ");
		System.out.println(st.countTokens());
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		//In nowadays,Split method is used instead of StringTokenizer.
		

	}

}
