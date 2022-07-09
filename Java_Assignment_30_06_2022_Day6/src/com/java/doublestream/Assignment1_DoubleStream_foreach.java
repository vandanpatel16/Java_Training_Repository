package com.java.doublestream;

import java.util.stream.DoubleStream;

public class Assignment1_DoubleStream_foreach {

	public static void main(String[] args) {
		
		double[] num = {10, 20, 30, 40, 50};
		
		DoubleStream stream = DoubleStream.of(num);
		stream.forEach(System.out::println);
	}

}
