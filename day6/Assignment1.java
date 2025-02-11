package com.celcom.day6;

import java.util.Scanner;

class DuplicateException extends RuntimeException {
	 
	 public String toString() {
		 return  "Array Element is already present" ;
		 
	 }
}

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		try {
			for(int i = 0; i < 10; i++) {
				System.out.println("Enter the " + i + " element : ");
				arr[i] = sc.nextInt();
				for(int j = 0; j < i; j++) {
					if(arr[i] == arr[j]) {
						throw new DuplicateException();
					}
				}
			}
			
		}catch(DuplicateException e) {
			System.out.println(e);
		}
//		for(int i = 0; i < 10; i++) {
//			System.out.print(arr[i] + " ");
//		}
		

	}

}
