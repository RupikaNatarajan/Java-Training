package com.celcom.saturday_assignments_15_feb_2025;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		System.out.println("Enter the Size of the list");
		int listSize = sc.nextInt();
		
		for(int i=0;i<listSize;i++) {
			list.add(sc.nextInt());
		}
		System.out.println("Original List Elements : " + list);
		Collections.sort(list);
		
		System.out.println("Sorted List : " + list);
		
		

	}

}
