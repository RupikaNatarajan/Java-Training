package com.celcom.day8;

import java.io.IOException;
import java.io.FileReader;


public class FileHandling1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("D://Example1.txt");
		int ch = 0 ;
		while((ch = fr.read())!= -1) {
			System.out.print((char)ch);
		}
		fr.close();
		
	}

}
