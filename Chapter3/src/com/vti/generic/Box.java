package com.vti.generic;

public class Box {
	
	public static <T> Crate<T> ship(T t) {
		System.out.println("Preparing " + t);
		return new Crate<T>();
	}
	
	public static void main(String[] args) {
		Crate<String> ship = Box.<String>ship("hello");
	}

}
