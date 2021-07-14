package com.vti.advance.innerclass.member;

public class Outer {
	private String greeting = "Hi";

	protected class Inner {
		int repeat = 3;

		public void go() {
			for (int i = 0; i < 3; i++) {
				System.out.println(greeting);
			}
		}
	}

	public void callInner() {
		Inner inner = new Inner();
		inner.go();
	}

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.callInner();

		Outer outer2 = new Outer();
		Inner inner2 = outer2.new Inner();
		inner2.go();
	}
}
