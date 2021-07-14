package com.vti.advance.innerclass.staticnested;

public class Ensclosing {
	static class Nested {
		private int price = 6;
	}

	public static void main(String[] args) {
		Nested nested = new Nested();
		System.out.println(nested.price); // 6
	}

}
