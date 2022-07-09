package com.java.doublestream;

import java.util.stream.DoubleStream;

public class Assignment2_DoubleStream_toArray {

	public static void main(String[] args) {
		
		double[] num = {10, 20, 30, 40, 50};
		
		DoubleStream stream2 = DoubleStream.of(num);
		double[] sum1 = stream2.toArray();
		for (double d:sum1) {
			System.out.println(d);
		}
	}

}
