package com.celcom.saturday_assignments_15_feb_2025;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new LinkedList<>();
		
		System.out.println("Enter the Size of the list");
		int listSize = sc.nextInt();
		
		for(int i=0;i<listSize;i++) {
			list.add(sc.nextInt());
		}
		
		
		//Way-1
		
//		List<Integer> list1 = new LinkedList<>(list);
//		System.out.println("Original List Elements : " + list);
//		System.out.println("Cloned List Elements : " + list1);
		
		//Way-2
		List<Integer> list1 = new LinkedList<>();
		for(Integer i : list) {
			list1.add(i);
		}
		System.out.println("Original List Elements : " + list);
		System.out.println("Cloned List Elements : " + list1);
	}

}
