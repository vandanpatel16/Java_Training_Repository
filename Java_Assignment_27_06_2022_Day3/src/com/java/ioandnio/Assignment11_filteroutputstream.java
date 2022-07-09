/*Java FilterOutputStream class implements the OutputStream class.
It provides different sub classes such as BufferedOutputStream and DataOutputStream to provide additional functionality.
So it is less used individually.*/

package com.java.ioandnio;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

public class Assignment11_filteroutputstream {

	public static void main(String[] args) {
		
		String str = "Good Afternoon";
		byte[] byt = str.getBytes();
		try {
			FileOutputStream file = new FileOutputStream("D:\\STS_4\\Java_Training\\Java_Assignment_27_06_2022_Day3\\src\\com\\java\\filteroutput.txt");
			FilterOutputStream data = new DataOutputStream(file);
			data.write(byt);
			System.out.println("Check the filteroutput.txt file");
			data.flush();
			file.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
