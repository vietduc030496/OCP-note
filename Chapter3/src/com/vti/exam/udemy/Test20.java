package com.vti.exam.udemy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author duc.nguyenviet
 *
 * Question 20
 */
public class Test20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 = new ArrayList<>();
		list1.add("A");
		list1.add("B");

		List<? extends Object> list2 = list1;
		list2.remove("A"); // Line 13
//		list2.add("C"); // Line 14 compiler error

		System.out.println(list2);
	}

}
