package com.celcom.day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Question5 {

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
