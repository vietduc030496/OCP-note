package com.vti.exam.udemy;

/**
 * @author duc.nguyenviet
 *
 * Questions 1
 */
public class T {
	@Override
	public String toString() {
		return "T";
	}
}

class Printer<T> {
	private T t;

	public Printer(T t) {
		super();
		this.t = t;
	}

	@Override
	public String toString() {
		return t.toString();
	}

}

class Test1 {
	public static void main(String[] args) {
		Printer<T> obj = new Printer<>(new T());
		System.out.println(obj);
	}
}
