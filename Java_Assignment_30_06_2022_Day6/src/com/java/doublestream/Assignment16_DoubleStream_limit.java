package com.java.doublestream;

import java.util.Arrays;

public class Assignment16_DoubleStream_limit {

	public static void main(String[] args) {
		
		double[] num = {10, 20, 30, 40, 50};
		Double[] result = Arrays.stream(num).limit(3).boxed().toArray(Double[]::new);
		System.out.println(Arrays.asList(result));
	}

}
