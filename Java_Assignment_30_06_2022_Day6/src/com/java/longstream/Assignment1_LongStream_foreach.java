package com.java.longstream;

import java.util.stream.LongStream;

public class Assignment1_LongStream_foreach {

	public static void main(String[] args) {
		
		long[] num = {10, 20, 30, 40, 50};
		
		LongStream stream = LongStream.of(num);
		stream.forEach(System.out::println);
	}

}
