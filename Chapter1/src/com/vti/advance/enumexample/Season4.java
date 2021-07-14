package com.vti.advance.enumexample;

public enum Season4 {
	WINTER {
		public void printHour() {
			System.out.println("Short time");
		}
	},
	SPRING {
		public void printHour() {
			System.out.println("Long time");
		}
	},
	SUMMER, FALL {
		public void printHour() {
			System.out.println("Default time");
		}
	};

}
