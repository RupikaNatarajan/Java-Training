package com.celcom.day6;


//Cloneable - Predefined method from lang package.
public class ObjectCloningExample implements Cloneable{
	
	//If a class implements Cloneable ,then the developer said that the object is public so anyone can clone 
	// the object in this class
	
	//Without implementing Cloneable interface we cannot clone any object from the class.
	//If developer  want to secure the objects ,then no need of implementing Cloneable interface.

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		ObjectCloningExample obj1 = new ObjectCloningExample();
		System.out.println(obj1.hashCode());
		
		ObjectCloningExample obj2 = (ObjectCloningExample) obj1.clone(); //Object Cloning
		//clone() is an predefined method from Object class.By using this clone() method we can make copy 
		//of any object
		
		//In object cloning we have two different hashcode values for obj1 and obj2.
		
		System.out.println(obj2.hashCode());
	}

}
