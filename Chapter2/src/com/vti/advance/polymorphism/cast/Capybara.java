package com.vti.advance.polymorphism.cast;

public class Capybara extends Rodent {

	public static void main(String[] args) {
		Rodent rodent = new Rodent();
		Capybara capybara = (Capybara) rodent; // throws ClassCastException
	}
}
