package com.celcom.day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//Java Program to Convert ArrayList to LinkedList and vice versa

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//ArrayList to LinkedList Conversion
		
		ArrayList<Object> list = new ArrayList<>();
		System.out.println("Enter the size of the list : ");
		int size = sc.nextInt();
		
		for(int index=0; index<size; index++) {
			list.add(sc.nextInt());
		}
		System.out.println("ArrayList Objects : " + list);
		
		LinkedList list1 = new LinkedList<>(list);
		
		System.out.println("LinkedList from ArrayList : " + list1);
		
		//LinkedList to ArrayList Conversion
		
		LinkedList<String> list2 = new LinkedList<>();
		
		System.out.println("Enter the size of the list : ");
		int size1 = sc.nextInt();
		
		for(int index=0; index<size1; index++) {
			list2.add(sc.next());
		}
		System.out.println("LinkedList Objects : " + list2);
		
		ArrayList<String> list3 = new ArrayList<>(list2);
		System.out.println("ArrayList from LinkedList : " + list3);
		
	}

}
