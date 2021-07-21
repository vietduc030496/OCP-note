package com.vti.generic;

public class Crate<T> {

	private T contents;

	public T emptyContents() {
		return contents;
	}

	public void packContent(T contents) {
		this.contents = contents;
	}
	
}
