package com.vti.advance.vitual;

public class Lion extends Animal {

	String name = "Leo";

	@Override
	public void play() {
		System.out.println("toss in meat");
	}

	@Override
	public void feed() {
		addMeet();
	}

	private void addMeet() {

	}
}
