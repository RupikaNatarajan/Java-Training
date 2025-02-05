package com.celcom.day2;

class Employee{
	//Variable Declaration
	int eid;
	String ename;
	double esalary;
	
	Employee(int eid, String ename, double esalary) {
		// TODO Auto-generated constructor stub
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}

	//Method
	void display() {
		System.out.println("Employee Id : " + eid);
		System.out.println("Employee Name : " + ename);
		System.out.println("Employee Salary : " + esalary);
		
	}
}


public class ClassAndObjectExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(101,"Rupika",15000);
		Employee e2 = new Employee(102,"Harini",18000);
		Employee e3 = new Employee(103,"Pravalika",20000);
		
		
		e1.display();
		e2.display();
		e3.display();
		
	}

}
