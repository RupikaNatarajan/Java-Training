package com.celcom.day2;
import java.util.Scanner;

public class ArrayExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[5];
		int sum = 0, evenCount = 0, oddCount = 0;
		
		System.out.println("Initial values of an Array");
		for(int index = 0; index < arr.length; index++) {
			System.out.println(arr[index]);
		}
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 5 values");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		for(int value : arr) {
			System.out.println(value);
			if(value % 2 == 0) {
				evenCount++;
			}
			else {
				oddCount++;
			}
			sum += value;
			
		}
		System.out.println("Sum of array elements : " + sum);
		System.out.println("No Of Even elements : " + evenCount);
		System.out.println("No Of Odd elements : " + oddCount);
	}

}
