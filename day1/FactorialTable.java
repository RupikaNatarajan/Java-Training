package com.celcom.day1;

import java.util.Scanner;

public class FactorialTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		sc.close();
		
		while(num1!=0) {
			int fact=1;
			for(int num=1;num<=num1;num++) {
				fact = fact*num;
			}
			System.out.println(fact);
			num1--;
		}
		
			
	}

}
