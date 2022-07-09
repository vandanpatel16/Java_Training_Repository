/*Java ByteArrayOutputStream class is used to write common data into multiple files.
In this stream, the data is written into a byte array which can be written to multiple streams later.
The ByteArrayOutputStream holds a copy of data and forwards it to multiple streams.
The buffer of ByteArrayOutputStream automatically grows according to data.*/


package com.java.ioandnio;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Assignment7_bytearrayoutputstream {

	public static void main(String[] args) throws IOException {
		
		String str = "%:@#'/*Good Morning*/'#@:%";
		byte[] byt = str.getBytes();
		
		try {
			FileOutputStream file1 = new FileOutputStream("D:\\STS_4\\Java_Training\\Java_Assignment_27_06_2022_Day3\\src\\com\\java\\bytearrayoutput1.txt");
			FileOutputStream file2 = new FileOutputStream("D:\\STS_4\\Java_Training\\Java_Assignment_27_06_2022_Day3\\src\\com\\java\\bytearrayoutput2.html");
			
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			out.write(byt);
			out.writeTo(file1);
			out.writeTo(file2);
			
			out.flush();
			out.close();
			System.out.println("Check the bytearrayoutput1.txt & bytearrayoutput2.html file");
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
