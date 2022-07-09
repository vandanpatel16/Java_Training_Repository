package com.java.longstream;

import java.util.stream.LongStream;

public class Assignment10_LongStream_findany {

	public static void main(String[] args) {
		
		long[] num = {10, 20, 30, 40, 50};
		
		LongStream stream1 = LongStream.of(num);
		System.out.println(stream1.findAny());
	}

}
