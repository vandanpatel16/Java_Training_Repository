package com.java.doublestream;

import java.util.stream.DoubleStream;

public class Assignment8_DoubleStream_allmatch {

	public static void main(String[] args) {
		
		double[] num = {2, 4, 6, 8, 10};
		
		DoubleStream stream7 = DoubleStream.of(num);
		System.out.println(stream7.allMatch(e -> e % 2 == 0));
		
		DoubleStream stream8 = DoubleStream.of(num);
		System.out.println(stream8.allMatch(e -> e % 2 == 1));
	}

}
