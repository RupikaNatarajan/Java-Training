package com.celcom.day8;


//Strings are immutable object like Array
//StringBuffers are mutable object

public class StringMethods3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Java";
		
		s1 = s1.concat("World"); //Here new memory is created for s1,and s1 refers the new string,now java become
								 //Unreferenced so the memory will automatically recycled by garbage collection.
		System.out.println(s1);
		
		//Strings are immutable - When we are trying to manipulate the string object instead of updating it ,
		//new memory is created
		
		//StringBuffers are mutable object - Without reassigning it will update in the same memory.
		
		StringBuffer sb = new StringBuffer("Java");
		sb.append(" World");
		System.out.println(sb);
		
		StringBuilder sb1 = new StringBuilder("Java");
		sb1.append(" World");
		System.out.println(sb1);
	}

}
