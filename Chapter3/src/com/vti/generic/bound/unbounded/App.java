package com.vti.generic.bound.unbounded;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<String> keywords = new ArrayList<String>();
		keywords.add("java");
//		printList(keywords); // DOES NOT COMPILER
		printListExpect(keywords);
	}
	
	public static void printList(List<Object> list) {
		for (Object object : list) {
			System.out.println(object);
		}
	}
	
	public static void printListExpect(List<?> list) {
		for (Object object : list) {
			System.out.println(object);
		}
	}
}
