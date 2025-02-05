package com.celcom.day2;

public class ArrayOfArrayExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[3][];	
		//No.of.Single dimension array is 3 But the size of each single dimension array may change
		
		arr[0] = new int[] {1, 2};
		arr[1] = new int[] {3, 4, 5, 6};
		arr[2] = new int[] {7, 8, 9};
		
		for(int row = 0; row < arr.length ; row++) {
			for(int col = 0; col < arr[row].length ; col++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
	}

}
