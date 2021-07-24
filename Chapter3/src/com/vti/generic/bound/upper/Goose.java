package com.vti.generic.bound.upper;

import java.util.List;

public class Goose implements Flyer {

	@Override
	public void fly() {
		// TODO Auto-generated method stub

	}
	
	public static void main(String[] args) {
		
	}
	
	private void anyFlyer(List<Flyer> flyer) {}
	private void groupOfFlyers(List<? extends Flyer> flyer) {}

}
