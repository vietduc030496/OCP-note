package com.vti.advance.innerclass.anonymous;

public class AnonInnerInterface {
	interface SalesTodayOnly {
		int dollarsOff();
	}

	public int admission(int basePrice) {
		SalesTodayOnly sale = new SalesTodayOnly() {

			@Override
			public int dollarsOff() {
				return 3;
			}
		};
		return basePrice - sale.dollarsOff();
	}
}
