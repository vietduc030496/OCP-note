package com.vti.advance.designInterface;

public class Eagle implements Fly {

	@Override
	public int getWingSpan() throws Exception {
		return 15;
	}

	@Override
	public void land() {
		System.out.println("Eage is driving fast");
	}

}
