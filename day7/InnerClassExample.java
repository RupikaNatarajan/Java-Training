package com.celcom.day7;

interface MyInterface {
	void display();
}

public class InnerClassExample implements MyInterface{
	
	public void display() {
		System.out.println("Anonymous Inner Class");
	}
	
	//1.Non-static Inner Class
	class InnerClass1 {
		void myMethod1() {
			System.out.println("Non-static Inner class");
		}
	}
	
	//2.static Inner Class
	static class InnerClass2 {
		static void myMethod1() {
			System.out.println("Static Inner class");
		}
	}
	
	void myMethod() {
		//3.Local Inner Class
		class InnerClass3 {
			void myMethod3() {
				System.out.println("Local Inner class");
			}
		}
		
		//We can access the local inner class within the method not outside the method.
		InnerClass3 inner3 = new InnerClass3();
		inner3.myMethod3();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Way to create object for inner class
		//InnerClassExample.InnerClass1 obj1 = new InnerClassExample().new InnerClass1();
		
		//Another way to create object for inner class
		InnerClassExample obj = new InnerClassExample();
		
		InnerClass1 obj1 = obj.new InnerClass1();
		obj1.myMethod1();
		
		InnerClassExample.InnerClass2 inner2 = new InnerClassExample.InnerClass2();
		inner2.myMethod1();
		
		//Anonymous inner class
		MyInterface obj2 = new MyInterface() {
			public void display() {
				System.out.println("Anonymous Inner Class");
			}
		};
		obj2.display();
		
		//Lambda Expression
		MyInterface obj3 = ()->System.out.println("Lambda Expression");
		obj3.display();
		
		
	}

}
