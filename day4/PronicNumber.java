package com.celcom.day4;
import java.util.Scanner;

public class PronicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int flag = 0;
		
		for(int i=1;i<=num;i++) {
			if(num % i == 0 && num % (i+1) ==0) {
				flag = 1;
			}
		}
		if(flag == 0) {
			System.out.println("Not a Pronic Number");
		}
		else {
			System.out.println("Pronic Number");
		}
		sc.close();
	}

}
