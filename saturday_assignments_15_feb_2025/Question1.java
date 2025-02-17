package com.celcom.saturday_assignments_15_feb_2025;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		System.out.println("Enter the Size of the list");
		int listSize = sc.nextInt();
		
		for(int i=0;i<listSize;i++) {
			list.add(sc.nextInt());
		}
		System.out.println("Enter the element to be searched");
		int searchElement = sc.nextInt();
		
		if(list.contains(searchElement)) {
			System.out.println("The Element is present in the list");
		}
		else {
			System.out.println("The Element is not present in the list");
		}
		

	}

}
