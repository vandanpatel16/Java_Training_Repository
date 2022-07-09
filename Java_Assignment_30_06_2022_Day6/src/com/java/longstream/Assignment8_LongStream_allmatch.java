package com.java.longstream;

import java.util.stream.LongStream;

public class Assignment8_LongStream_allmatch {

	public static void main(String[] args) {
		
		long[] num = {2, 4, 6, 8, 10};
		
		LongStream stream7 = LongStream.of(num);
		System.out.println(stream7.allMatch(e -> e % 2 == 0));
		
		LongStream stream8 = LongStream.of(num);
		System.out.println(stream8.allMatch(e -> e % 2 == 1));
	}

}
