package com.celcom.day6;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsKeyword {
	
	static void m1() throws FileNotFoundException {
		FileReader f = new FileReader("Test.txt");
	}
	
	//Throws keyword in m1() ignore the compile time error and executes the business 
	//logic
	
	//But it is m2()'s responsibility to handle the exception using try catch block 
	//because it is calling the m1() method.
	
	static void m2() {
		try {
			m1();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
