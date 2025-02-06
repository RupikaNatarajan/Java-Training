package com.celcom.day3;

class Student{
	String name;
	int rollno;
	static String dept = "IT";
	float cgpa;
	public Student(String name, int rollno, float cgpa) {
		
		this.name = name;
		this.rollno = rollno;
		this.cgpa = cgpa;
	}
	void display() {
		System.out.println("Student Name : " + name);
		System.out.println("Student ID : " + rollno);
		System.out.println("CGPA : " + cgpa);
	}
	static void displayDept() {
		System.out.println("Department : " + dept);
	}
	
	

}

public class ClassAndObjectRecap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student.displayDept();
		Student s1 = new Student("Rupika", 101, 9.5f);
		s1.display();
		Student s2 = new Student("Priya", 102, 9.6f);
		s2.display();
		
		

	}

}
