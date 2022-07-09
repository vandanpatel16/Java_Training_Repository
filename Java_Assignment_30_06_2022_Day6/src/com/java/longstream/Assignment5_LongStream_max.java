package com.java.longstream;

import java.util.stream.LongStream;

public class Assignment5_LongStream_max {

	public static void main(String[] args) {
		
		long[] num = {10, 20, 30, 40, 50};
		
		LongStream stream4 = LongStream.of(num);
		System.out.println(stream4.max());
	}

}
