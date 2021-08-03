package com.vti.exam.udemy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author duc.nguyenviet
 *
 * Question 14
 */
public class Test5 {

	public static void main(String[] args) {
		List<? extends String> list = new ArrayList<>(Arrays.asList("A", "E", "I", "O")); // Line 8
//		list.add("U"); // Line 9 compiler error
		list.forEach(System.out::print);
	}

}
