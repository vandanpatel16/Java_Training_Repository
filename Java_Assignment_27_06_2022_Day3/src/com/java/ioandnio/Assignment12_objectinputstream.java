/*The ObjectInputStream is mainly used to read data written by the ObjectOutputStream.
Basically, the ObjectOutputStream converts Java objects into corresponding streams. This is known as serialization. Those converted streams can be stored in files or transferred through networks.
Now, if we need to read those objects, we will use the ObjectInputStream that will convert the streams back to corresponding objects. This is known as deserialization.
Now, if we need to read those objects, we will use the ObjectInputStream that will convert the streams back to corresponding objects. This is known as deserialization.
Note: The ObjectOutputStream class only writes those objects that implement the Serializable interface. This is because objects need to be serialized while writing to the stream*/


package com.java.ioandnio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Assignment12_objectinputstream {

	public static void main(String[] args) {
		
		String data = "Good Morning";
		try {
			
			FileOutputStream file = new FileOutputStream("D:\\STS_4\\Java_Training\\Java_Assignment_27_06_2022_Day3\\src\\com\\java\\objectstreamout.txt");
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(data);
			
			FileInputStream file1 = new FileInputStream("D:\\STS_4\\Java_Training\\Java_Assignment_27_06_2022_Day3\\src\\com\\java\\objectstreamout.txt");
			ObjectInputStream ois = new ObjectInputStream(file1);
			
			System.out.println("Message: " + ois.readObject());

			ois.close();
			file1.close();
			out.close();
			file.close();
		}
		catch(IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
