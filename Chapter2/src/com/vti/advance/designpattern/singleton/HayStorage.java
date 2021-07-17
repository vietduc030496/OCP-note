package com.vti.advance.designpattern.singleton;

public class HayStorage {

	private int quantity;

	private HayStorage() {
	};

	private static HayStorage instance = new HayStorage();

	public static HayStorage getInstance() {
		return instance;
	}

	public synchronized void addHay(int amount) {
		this.quantity += amount;
	}

	public synchronized boolean removeHay(int amount) {
		if (quantity < amount)
			return false;
		quantity -= amount;
		return true;
	}

	public synchronized int getHayQuantity() {
		return quantity;
	}
}
