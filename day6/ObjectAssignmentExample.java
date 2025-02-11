package com.celcom.day6;

public class ObjectAssignmentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectAssignmentExample obj1 = new ObjectAssignmentExample();
		System.out.println(obj1.hashCode());
		
		ObjectAssignmentExample obj2 = obj1; //Object Assigment
		//One object has two reference.
		//If any changes done on obj1 will be reflected on obj2
		//But in object Cloning a duplicate copy is created but in object assignment there is only one copy ,
		//but has two reference.
		System.out.println(obj2.hashCode());
		
	}

}
