package com.java.longstream;

import java.util.stream.LongStream;

public class Assignment9_LongStream_nonematch {

	public static void main(String[] args) {
		
		long[] num = {2, 4, 6, 8, 10};
		
		LongStream stream7 = LongStream.of(num);
		System.out.println(stream7.noneMatch(e -> e % 2 == 0));
		
		LongStream stream8 = LongStream.of(num);
		System.out.println(stream8.noneMatch(e -> e % 2 == 1));
	}

}
