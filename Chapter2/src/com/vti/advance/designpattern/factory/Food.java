package com.vti.advance.designpattern.factory;

public abstract class Food {

	public int quantity;

	public Food(int quantity) {
		super();
		this.quantity = quantity;
	}

	public int getQuantity() {
		return quantity;
	}
	
	public abstract void consumed();
}
