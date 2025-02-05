package com.celcom.day2;

public class InstanceVsStatic {
	int a=10;
	static int b=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Instance variable
		System.out.println("Instance Variable example");
		InstanceVsStatic obj1  = new InstanceVsStatic();
		InstanceVsStatic obj2  = new InstanceVsStatic();
		
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		
		obj1.a = 20;
		
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		
		//Static Variable
		System.out.println("Static Variable example");
		InstanceVsStatic sObj1  = new InstanceVsStatic();
		InstanceVsStatic sObj2  = new InstanceVsStatic();
		
		System.out.println(sObj1.b);
		System.out.println(sObj2.b);
		
		sObj1.b = 20;
		
		System.out.println(sObj1.b);
		System.out.println(sObj2.b);
		
	}

}
