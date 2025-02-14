package com.celcom.day9;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new LinkedList<>(); //Generics -> <Integer> (Within the angular bracket)
		list.add(10);
		list.add(30);
		list.add(20);
		list.add(10);
		//Return output in the insertion order and also allows duplicates.
		System.out.println(list);
		
		System.out.println(list.get(0));
		list.add(2,15);
		System.out.println(list);
		list.set(2, 150);
		System.out.println(list);
		
		list.remove(new Integer(10)); //It will remove the object 10
		list.remove(0);		//It will remove the object at index 0
		System.out.println(list);
		
		
		System.out.println(list.size());
		
		System.out.println(list.contains(20));
		System.out.println(list.isEmpty());
		
		//Traversing the list.
		
		//Way-1
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		
		
		//Way-2
		for(Integer i : list) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		
		//Way-3
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
	}

}
