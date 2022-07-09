package com.java.longstream;

import java.util.stream.LongStream;

public class Assignment3_LongStream_reduce {

	public static void main(String[] args) {
		
		long[] num = {2, 4, 6, 8, 10};
		
		LongStream stream1 = LongStream.of(num);
		long sum = stream1.reduce(0,(x,y)-> x+y);
		System.out.println(sum);
		
		LongStream stream2 = LongStream.of(num);
		long sum1 = stream2.reduce(0,(x,y)-> x-y);
		System.out.println(sum1);
		
		LongStream stream3 = LongStream.of(num);
		long sum2 = stream3.reduce(1,(x,y)-> x*y);
		System.out.println(sum2);
		
		LongStream stream4 = LongStream.of(num);
		long sum3 = stream4.reduce(10000,(x,y)-> x/y);
		System.out.println(sum3);
		
		LongStream stream1a = LongStream.of(num);
		long suma = stream1a.reduce(0,Long::sum);
		System.out.println(suma);
		
		LongStream stream2a = LongStream.of(num);
		long sum1a = stream2a.reduce(0,Long::min);
		System.out.println(sum1a);
		
		LongStream stream3a = LongStream.of(num);
		long sum2a = stream3a.reduce(0,Long::max);
		System.out.println(sum2a);
	}

}
