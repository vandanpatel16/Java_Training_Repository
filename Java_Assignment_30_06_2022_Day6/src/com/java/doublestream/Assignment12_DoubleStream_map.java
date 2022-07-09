package com.java.doublestream;

import java.util.Arrays;

public class Assignment12_DoubleStream_map {

	public static void main(String[] args) {
		
		double[] num = {10, 20, 30, 40, 50};
		Double[] result = Arrays.stream(num).map(n -> n*2).boxed().toArray(Double[]::new);
		System.out.println(Arrays.asList(result));
	}

}
