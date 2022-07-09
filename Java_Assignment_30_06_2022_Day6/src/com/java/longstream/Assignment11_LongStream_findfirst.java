package com.java.longstream;

import java.util.stream.LongStream;

public class Assignment11_LongStream_findfirst {

	public static void main(String[] args) {
		
		long[] num = {10, 20, 30, 40, 50};
		
		LongStream stream1 = LongStream.of(num);
		System.out.println(stream1.findFirst());
	}

}
