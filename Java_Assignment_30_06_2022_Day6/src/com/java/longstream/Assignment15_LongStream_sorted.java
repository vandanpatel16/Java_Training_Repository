package com.java.longstream;

import java.util.Arrays;

public class Assignment15_LongStream_sorted {

	public static void main(String[] args) {
		
		long[] num = {10, 40, 30, 20, 50};
		Long[] result = Arrays.stream(num).sorted().boxed().toArray(Long[]::new);
		System.out.println(Arrays.asList(result));
	}

}
