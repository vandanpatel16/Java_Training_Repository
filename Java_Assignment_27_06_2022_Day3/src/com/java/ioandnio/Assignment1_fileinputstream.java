/*Java FileInputStream class obtains input bytes from a file.
It is used for reading byte-oriented data (streams of raw bytes) such as image data, audio, video etc.
You can also read character-stream data.*/

package com.java.ioandnio;

import java.io.FileInputStream;
import java.io.IOException;

public class Assignment1_fileinputstream {

	public static void main(String[] args) {
		
		int data = 0;
		
		try {
			FileInputStream file = new FileInputStream("D:\\STS_4\\Java_Training\\Java_Assignment_27_06_2022_Day3\\src\\com\\java\\fileinput.txt");
			
			while((data = file.read())!=-1) {
				System.out.print((char)data);	
			}
			file.close();
		} 
		catch(IOException e) {
			System.out.println(e);
		}
	}

}
