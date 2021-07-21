package com.vti.arraylist;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExampleSortAndSearch {

	public static void main(String[] args) {
		int[] number = {6, 9, 1, 8};
		Arrays.sort(number);
		System.out.println(Arrays.toString(number)); // [1, 6, 8, 9]
		System.out.println(Arrays.binarySearch(number, 6)); // 1
		System.out.println(Arrays.binarySearch(number, 2)); // -2
		
		List<Integer> list = Arrays.asList(9, 7, 5, 3);
		Collections.sort(list); // [3, 5, 7, 9]
		System.out.println(list);
		System.out.println(Collections.binarySearch(list, 3));	// 0
		System.out.println(Collections.binarySearch(list, 2));	// -1
	}

}
