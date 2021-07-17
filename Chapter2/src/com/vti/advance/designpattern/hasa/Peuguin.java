package com.vti.advance.designpattern.hasa;

public class Peuguin {

	private Flippers flippers;
	private WebbedFeet webbedFeet;

	public Peuguin(Flippers flippers, WebbedFeet webbedFeet) {
		super();
		this.flippers = flippers;
		this.webbedFeet = webbedFeet;
	}

	public void flap() {
		flippers.flap();
	}

	public void kick() {
		webbedFeet.kick();
	}
}
