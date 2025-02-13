package com.celcom.day8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageCopyExample1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fr = new FileInputStream("D://Bird.jpg");
		FileOutputStream fw = new FileOutputStream("D://Bird1.jpg");
		
		int ch = 0 ;
		while((ch = fr.read())!= -1) {
			fw.write(ch);
		}
		fr.close();
		fw.close();
		System.out.println("Image Copied");
	}

}

