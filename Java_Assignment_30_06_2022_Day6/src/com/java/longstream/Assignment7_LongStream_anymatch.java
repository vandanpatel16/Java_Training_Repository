package com.java.longstream;

import java.util.function.LongPredicate;
import java.util.stream.LongStream;

public class Assignment7_LongStream_anymatch {

	public static void main(String[] args) {
		
		long[] num = {1, 3, 5, 7, 17};
		
		LongStream stream6 = LongStream.of(num);
		System.out.println(stream6.anyMatch(e -> e % 11 == 0));
		
		LongPredicate pre = e -> e % 3 == 0;
		LongStream stream7 = LongStream.of(num);
		System.out.println(stream7.anyMatch(pre));
	}

}
