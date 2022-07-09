package com.java.longstream;

import java.util.Arrays;

public class Assignment13_LongStream_filter {

	public static void main(String[] args) {
		
		long[] num = {10, 20, 30, 40, 50};
		Long[] result = Arrays.stream(num).filter(n -> n<30).map(n -> n*2).boxed().toArray(Long[]::new);
		System.out.println(Arrays.asList(result));
	}

}
