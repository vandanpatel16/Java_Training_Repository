package com.java.longstream;

import java.util.stream.LongStream;

public class Assignment2_LongStream_toArray {

	public static void main(String[] args) {
		
		long[] num = {10, 20, 30, 40, 50};
		
		LongStream stream2 = LongStream.of(num);
		long[] sum1 = stream2.toArray();
		for (long d:sum1) {
			System.out.println(d);
		}
	}

}
