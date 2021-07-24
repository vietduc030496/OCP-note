package com.vti.generic.bound.upper;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
//		List<Number> list = new ArrayList<Integer>() // DOES NOT COMPILER
		List<? extends Number> list = new ArrayList<Integer>();
		
	}
	
	public static long total(List<? extends Number> list) {
		long total = 0;
		for (Number number : list) {
			total += number.longValue();
		}
		return total;
	}
}
