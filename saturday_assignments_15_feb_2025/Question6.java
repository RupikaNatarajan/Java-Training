package com.celcom.saturday_assignments_15_feb_2025;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new LinkedList<>();
		
		System.out.println("Enter the Size of the list");
		int listSize = sc.nextInt();
		
		for(int i=0;i<listSize;i++) {
			list.add(sc.nextInt());
		}
		
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	} 

}
