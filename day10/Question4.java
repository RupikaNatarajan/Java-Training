package com.celcom.day10;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer array1[] = {1,2,5,2,3};
		Integer array2[] = {1,2,5,3};
		
		System.out.println(sameElements(array1,array2));
	
		
		

	}
	static boolean sameElements(Integer[] array1,Integer[] array2) {
		Set<Object> elements1 = new HashSet<>(Arrays.asList(array1));
		Set<Object> elements2 = new HashSet<>(Arrays.asList(array2));
		
		if (elements1.size() != elements2.size()) 
			return false;
		
		for (Object obj : elements1) {
			
			if (!elements2.contains(obj)) 
				return false;
		}
		
		return true;
		
		
		
		
	}

}
