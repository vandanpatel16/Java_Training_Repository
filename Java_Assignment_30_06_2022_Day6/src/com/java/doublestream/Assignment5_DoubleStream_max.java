package com.java.doublestream;

import java.util.stream.DoubleStream;

public class Assignment5_DoubleStream_max {

	public static void main(String[] args) {
		
		double[] num = {10, 20, 30, 40, 50};
		
		DoubleStream stream4 = DoubleStream.of(num);
		System.out.println(stream4.max());
	}

}
