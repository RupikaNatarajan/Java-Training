package com.celcom.day9;

import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> vec = new Vector<>(3, 2);
		
		System.out.println(vec.size()); // "0" - Initially no element in vector so size is zero
		System.out.println(((Vector<Integer>) vec).capacity()); // "3" - We pass argument while object cretaing 
				//in that first argument is the capacity of vector,so initially vector allocates 3 memeory space
		vec.add(10);
		vec.add(20);
		vec.add(30);
		
		System.out.println(vec.size());  //Now size is 3
		System.out.println(((Vector<Integer>) vec).capacity());  //Capacity also 3		
		vec.add(40);  //Now the vector size is expanded based on increment factor.Second argument is the increment 
						//factor
		System.out.println(vec.size());  //4
		System.out.println(((Vector<Integer>) vec).capacity()); //capacity extended by increment factor to 5
		
		
		//Way-1
		for(int i=0;i<vec.size();i++) {
			System.out.print(vec.get(i) + " ");
		}
		System.out.println();
		
		//Way-2
		for(Integer i : vec) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		//Way-3
		Enumeration<Integer> e = ((Vector<Integer>) vec).elements();
		while(e.hasMoreElements()) {
			System.out.print(e.nextElement() + " ");
		}
		System.out.println();
		
		
		
	}

}
