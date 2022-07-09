package com.java.longstream;

import java.util.stream.LongStream;

public class Assignment6_LongStream_count {

	public static void main(String[] args) {
		
		long[] num = {10, 20, 30, 40, 50};
		
		LongStream stream5 = LongStream.of(num);
		System.out.println(stream5.count());
	}

}
