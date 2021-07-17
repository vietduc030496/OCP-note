package com.vti.advance.designpattern.singleton.lazy;

public class VisitorTicketTracker {

	private VisitorTicketTracker() {

	}

	private static VisitorTicketTracker instance;

	public static VisitorTicketTracker getInstance() {
		if (instance == null) {
			instance = new VisitorTicketTracker(); // NOT THREAD SAFE
		}

		return instance;
	}

	public static synchronized VisitorTicketTracker getTicketTrackerSynz() {
		if (instance == null) {
			instance = new VisitorTicketTracker(); // NOT THREAD SAFE
		}

		return instance;
	}

}
