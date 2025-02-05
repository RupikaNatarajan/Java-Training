package com.celcom.day2;

import java.util.Arrays;

public class ArraySortingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3, 6, 4, 9, 1, 8};
		
		Arrays.sort(arr);
		
		//To print in Ascending order
		for(int index = 0; index < arr.length ; index++) {
			System.out.print(arr[index] + " ");
		}
		System.out.println();
		System.out.println("Minimum value : " + arr[0]);
		System.out.println("Second Minimum value : " + arr[1]);
		
		System.out.println("Maximum value : " + arr[arr.length - 1]);
		System.out.println("Second Maximum value : " + arr[arr.length - 2]);
		
		//To print in Descending order
		for(int index = arr.length - 1 ; index >= 0; index--) {
			System.out.print(arr[index] + " ");
		}
		
	}

}
