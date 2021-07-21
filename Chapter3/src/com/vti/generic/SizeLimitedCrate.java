package com.vti.generic;

public class SizeLimitedCrate<T, U> {

	private T contents;
	private U sizeLimit;

	public SizeLimitedCrate(T contents, U sizeLimit) {
		super();
		this.contents = contents;
		this.sizeLimit = sizeLimit;
	}

}
