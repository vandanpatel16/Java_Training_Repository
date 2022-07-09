package com.java.longstream;

import java.util.Arrays;

public class Assignment14_LongStream_distinct {

	public static void main(String[] args) {
		
		long[] num = {10, 20, 10, 40, 30, 20, 40, 50, 20, 50, 30};
		Long[] result = Arrays.stream(num).distinct().filter(n -> n<60).map(n -> n*2).boxed().toArray(Long[]::new);
		System.out.println(Arrays.asList(result));
	}

}
