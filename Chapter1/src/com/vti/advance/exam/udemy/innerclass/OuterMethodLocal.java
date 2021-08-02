package com.vti.advance.exam.udemy.innerclass;

/**
 * @author duc.nguyenviet
 *
 * Questions 45
 */
public class OuterMethodLocal {
	private String msg = "A";
	public void print() {
		final String msg = "B";
		class Inner {
			String msg = "C";
			public void print() {
				System.out.println(msg); // C
				System.out.println(this.msg); // C
				System.out.println(OuterMethodLocal.this.msg); // A
			}
		}
		Inner obj = new Inner();
        obj.print();
	}

}

class Test3 {
	public static void main(String[] args) {
		new OuterMethodLocal().print(); 
	}
}
