package com.java.doublestream;

import java.util.function.DoublePredicate;
import java.util.stream.DoubleStream;

public class Assignment7_DoubleStream_anymatch {

	public static void main(String[] args) {
		
		double[] num = {1, 3, 5, 7, 17};
		
		DoubleStream stream6 = DoubleStream.of(num);
		System.out.println(stream6.anyMatch(e -> e % 11 == 0));
		
		DoublePredicate pre = e -> e % 3 == 0;
		DoubleStream stream7 = DoubleStream.of(num);
		System.out.println(stream7.anyMatch(pre));
	}

}
