package com.vti.advance.enumexample;

public enum Season2 {
	WINTER("Low"), SPRING("Medium"), SUMMER("High"), FALL("Medium");

	private String expectedVisitor;

	private Season2(String expectedVisitor) {
		this.expectedVisitor = expectedVisitor;
	}

	public void printExpectedVisitor() {
		System.out.println(expectedVisitor);
	}

	public static void main(String[] args) {
		Season2.SUMMER.printExpectedVisitor();
	}
}
