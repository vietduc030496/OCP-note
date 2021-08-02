package com.vti.advance.exam.udemy.innerclass;

/**
 * @author duc.nguyenviet
 *
 * Questions 75
 */
public class Test4 {
	int i = 100;

	I5 obj1 = new I5() {
		int i = 200;

		public void print() {
			System.out.println(this.i);
		}
	};

	I5 obj2 = () -> {
		int i = 300;
		System.out.println(this.i);
	};
	
	public static void main(String[] args) {
		Test4 ques = new Test4();
		ques.obj1.print();
		ques.obj2.print();
	}

}

@FunctionalInterface
interface I5 {
	void print();
}
