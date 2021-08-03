package com.vti.exam.udemy;

/**
 * @author duc.nguyenviet
 *
 * Questions 5
 */
public class Test2 {

	public static void main(String[] args) {
		Generic<D> obj = new Generic();
	}

}

class A {
}

interface M {
}

interface N {
}

class B extends A {
}

class C extends A implements M {
}

class D extends A implements M, N {
}

class Generic<T extends A & M & N> {
}
