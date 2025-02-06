package com.celcom.day3;



public class CallingConstructorUsingThis {
	
	CallingConstructorUsingThis(){
		this("Rupika");
		System.out.println("A");
	}
	
	
	CallingConstructorUsingThis(String name){
		this(10);
		System.out.println("B");
	}
	
	CallingConstructorUsingThis(int a){
		System.out.println("C");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallingConstructorUsingThis obj = new CallingConstructorUsingThis();
		
		/*Instead of creating individual object to call each constructor, we create only one object to 
		 * call the default constructor,inside that we call the current class constructor using this 
		 * keyword
		 */

	}

}
