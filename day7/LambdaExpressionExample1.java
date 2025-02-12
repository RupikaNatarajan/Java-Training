package com.celcom.day7;

interface Calculator {
	int calc(int a,int b);
}


/* In initial methods,we have to define four implementing  class to define methods for
add,sub,mul and div.*/
/*In anonymous class we have to define the interface in a normal class and no need 
 * of implementing class.*/
/*In lambda expression , we dont have implementing class as well as the number of 
 lines of code also reduced*/

public class LambdaExpressionExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator c = (a, b) -> a + b;
		System.out.println(c.calc(10, 20));
		
		c = (a, b) -> a - b;
		System.out.println(c.calc(20, 10));

	}

}
