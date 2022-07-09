package com.java.doublestream;

import java.util.stream.DoubleStream;

public class Assignment4_DoubleStream_min {

	public static void main(String[] args) {
		
		double[] num = {10, 20, 30, 40, 50};
		
		DoubleStream stream = DoubleStream.of(num);
		System.out.println(stream.min());
	}

}
