package com.celcom.saturday_assignments_15_feb_2025;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question3 implements Cloneable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		System.out.println("Enter the Size of the list");
		int listSize = sc.nextInt();
		
		for(int i=0;i<listSize;i++) {
			
			list.add(sc.nextInt());
		}
		List<Integer> list1 = new ArrayList<>(list);
		System.out.println("Original List Elements : " + list);
		System.out.println("Cloned List Elements : " + list1);
	}

}
