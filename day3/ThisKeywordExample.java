package com.celcom.day3;

public class ThisKeywordExample {
	 
	String name;
	
	ThisKeywordExample(){			
		this("Rupika");				//Calling current class constructor using this keyword
	}
	
	ThisKeywordExample(String name){
		this.name = name;			//Calling current class variable using this keyword
		this.greeting();			//Calling current class method using this keyword
	}
	
	void greeting() {
		System.out.println("Welcome " + name);
	}

	public static void main(String[] args) {
		
		ThisKeywordExample obj = new ThisKeywordExample();
		
		/*new ThisKeywordExample();  -> This will call the default constructor that will call the current class 
		 * constructor where the name will be assigned and the current class method also called which prints the output. 
		 */
		

	}

}
