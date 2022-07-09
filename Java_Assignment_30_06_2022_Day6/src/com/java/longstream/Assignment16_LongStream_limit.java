package com.java.longstream;

import java.util.Arrays;

public class Assignment16_LongStream_limit {

	public static void main(String[] args) {
		
		long[] num = {10, 20, 30, 40, 50};
		Long[] result = Arrays.stream(num).limit(3).boxed().toArray(Long[]::new);
		System.out.println(Arrays.asList(result));
	}

}
