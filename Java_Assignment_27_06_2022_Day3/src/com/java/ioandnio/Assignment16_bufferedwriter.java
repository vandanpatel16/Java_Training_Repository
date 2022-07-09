/*Java BufferedWriter class is used to provide buffering for Writer instances.
It makes the performance fast.
It inherits Writer class.
The buffering characters are used for providing the efficient writing of single arrays, characters, and strings.
*/

package com.java.ioandnio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Assignment16_bufferedwriter {

	public static void main(String[] args) {
		
		try {
			FileWriter out = new FileWriter("D:\\STS_4\\Java_Training\\Java_Assignment_27_06_2022_Day3\\src\\com\\java\\bufferedwriter.txt");
			BufferedWriter buff = new BufferedWriter(out);
			buff.write("Good Afternoon");
			System.out.println("Please check the bufferedwriter.txt file.");
			buff.close();
			out.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
