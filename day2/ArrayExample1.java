package com.celcom.day2;

public class ArrayExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10, 20, 30, 40, 50};
		int sum=0;
		
		System.out.println("Array Length : " + arr.length);
		
		System.out.println("Array Elements");
		for(int index=0; index<arr.length; index++) {
			System.out.println("Element at index " + index +" : " +arr[index]);
			sum += arr[index];
		}
		System.out.println("Sum of array elements : " + sum);
		
		for(int value : arr) {
			System.out.println(value);
		}
	}
	

}
