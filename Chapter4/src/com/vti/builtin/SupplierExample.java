package com.vti.builtin;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {
		Supplier<LocalDate> s1 = LocalDate::now;
		Supplier<LocalDate> s2 = () -> LocalDate.now();
		
		LocalDate d1 = s1.get();
		LocalDate d2 = s2.get();
		
		System.out.println(d1);
		System.out.println(d2);
		
		Supplier<StringBuilder> s3 = StringBuilder::new;
		Supplier<StringBuilder> s4 = StringBuilder::new;
		
		StringBuilder sb1 = s3.get();
		StringBuilder sb2 = s4.get();
		
		Supplier<ArrayList<String>> s5 = ArrayList<String>::new;
		ArrayList<String> arrayList = s5.get();
		System.out.println(arrayList);
		
	}

}
