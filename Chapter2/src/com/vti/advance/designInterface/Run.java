package com.vti.advance.designInterface;

public interface Run extends Walk {

	public abstract boolean canHuntWhileRunning();

	@Override
	abstract double getMaxSpeed();
}
