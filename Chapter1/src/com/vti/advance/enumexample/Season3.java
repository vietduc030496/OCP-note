package com.vti.advance.enumexample;

public enum Season3 {

	WINTER {
		@Override
		public void printHour() {
			System.out.println("9am-3pm");

		}
	},
	SPRING {

		@Override
		public void printHour() {
			System.out.println("9am-7pm");

		}

	},
	SUMMER {

		@Override
		public void printHour() {
			System.out.println("9am-3pm");

		}

	},
	FALL {

		@Override
		public void printHour() {
			System.out.println("9am-5pm");

		}

	};

	public abstract void printHour();

}
