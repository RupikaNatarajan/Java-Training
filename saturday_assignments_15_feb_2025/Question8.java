package com.celcom.saturday_assignments_15_feb_2025;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new LinkedList<>();
		
		System.out.println("Enter the Size of the list");
		int listSize = sc.nextInt();
		
		for(int i=0;i<listSize;i++) {
			list.add(sc.nextInt());
		}
	
		for(int i = listSize-1 ; i >= 0; i--) {
			System.out.println(list.get(i));
		}
	}

}
