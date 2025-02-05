package com.celcom.day1;
import java.util.Scanner;

public class UserInputExample{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee id, name and salary");
		int eid = sc.nextInt();
		String ename = sc.next();
		double esalary = sc.nextDouble();
		sc.close();
		System.out.println("Employee Id : " + eid);
		System.out.println("Employee Name : " + ename);
		System.out.println("Employee salary : " + esalary);

	}
}