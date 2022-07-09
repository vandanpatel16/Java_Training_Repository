package com.java.doublestream;

import java.util.stream.DoubleStream;

public class Assignment3_DoubleStream_reduce {

	public static void main(String[] args) {
		
		double[] num = {2.5, 4, 6, 8, 10};
		
		DoubleStream stream1 = DoubleStream.of(num);
		double sum = stream1.reduce(0.5,(x,y)-> x+y);
		System.out.println(sum);
		
		DoubleStream stream2 = DoubleStream.of(num);
		double sum1 = stream2.reduce(0,(x,y)-> x-y);
		System.out.println(sum1);
		
		DoubleStream stream3 = DoubleStream.of(num);
		double sum2 = stream3.reduce(1,(x,y)-> x*y);
		System.out.println(sum2);
		
		DoubleStream stream4 = DoubleStream.of(num);
		double sum3 = stream4.reduce(10000,(x,y)-> x/y);
		System.out.println(sum3);
		
		DoubleStream stream1a = DoubleStream.of(num);
		double suma = stream1a.reduce(0,Double::sum);
		System.out.println(suma);
		
		DoubleStream stream2a = DoubleStream.of(num);
		double sum1a = stream2a.reduce(0,Double::min);
		System.out.println(sum1a);
		
		DoubleStream stream3a = DoubleStream.of(num);
		double sum2a = stream3a.reduce(0,Double::max);
		System.out.println(sum2a);

	}

}
