/*it can be used to read byte array as input stream.
Java ByteArrayInputStream class contains an internal buffer which is used to read byte array as stream.
In this stream, the data is read from a byte array.
The buffer of ByteArrayInputStream automatically grows according to data.*/

package com.java.ioandnio;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Assignment6_bytearrayinputstream {

	public static void main(String[] args) {

		int data = 0;
		byte[] byt = {37,58,92,39,63};
		
		try {
			ByteArrayInputStream bais = new ByteArrayInputStream(byt);
			while((data = bais.read())!=-1) {
				char ch = (char)data;
				System.out.println("[ ASCII value of "+data+", charater is: "+ch+" ] ");
			}
			bais.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
