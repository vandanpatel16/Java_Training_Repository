package com.java.doublestream;

import java.util.stream.DoubleStream;

public class Assignment10_DoubleStream_findany {

	public static void main(String[] args) {
		
		double[] num = {10, 20, 30, 40, 50};
		
		DoubleStream stream1 = DoubleStream.of(num);
		System.out.println(stream1.findAny());
	}

}
