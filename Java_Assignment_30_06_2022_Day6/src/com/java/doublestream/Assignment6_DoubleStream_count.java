package com.java.doublestream;

import java.util.stream.DoubleStream;

public class Assignment6_DoubleStream_count {

	public static void main(String[] args) {
		
		double[] num = {10, 20, 30, 40, 50};
		
		DoubleStream stream5 = DoubleStream.of(num);
		System.out.println(stream5.count());
	}

}
