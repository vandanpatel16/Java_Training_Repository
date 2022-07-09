/*Java FileReader class is used to read data from the file.
It returns data in byte format like FileInputStream class.
It is character-oriented class which is used for file handling in java.*/

package com.java.ioandnio;

import java.io.FileReader;
import java.io.IOException;

public class Assignment15_filereader {

	public static void main(String[] args) {
		
		int data = 0;
		try {
			FileReader file = new FileReader("D:\\STS_4\\Java_Training\\Java_Assignment_27_06_2022_Day3\\src\\com\\java\\filewriter.txt");
			while((data = file.read())!=-1) {
				System.out.print((char)data);
			}
			file.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
