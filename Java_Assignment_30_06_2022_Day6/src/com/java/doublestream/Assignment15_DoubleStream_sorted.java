package com.java.doublestream;

import java.util.Arrays;

public class Assignment15_DoubleStream_sorted {

	public static void main(String[] args) {
		
		double[] num = {10, 40, 30, 20, 50};
		Double[] result = Arrays.stream(num).sorted().boxed().toArray(Double[]::new);
		System.out.println(Arrays.asList(result));
	}

}
