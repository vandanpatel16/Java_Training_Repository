package com.java.longstream;

import java.util.stream.LongStream;

public class Assignment4_LongStream_min {

	public static void main(String[] args) {
		
		long[] num = {10, 20, 30, 40, 50};
		
		LongStream stream = LongStream.of(num);
		System.out.println(stream.min());
	}

}
