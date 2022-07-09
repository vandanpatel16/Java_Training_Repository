package com.java.doublestream;

import java.util.Arrays;

public class Assignment14_DoubleStream_distinct {

	public static void main(String[] args) {
		
		double[] num = {10, 20, 10, 40, 30, 20, 40, 50, 20, 50, 30};
		Double[] result = Arrays.stream(num).distinct().filter(n -> n<60).map(n -> n*2).boxed().toArray(Double[]::new);
		System.out.println(Arrays.asList(result));
	}

}
