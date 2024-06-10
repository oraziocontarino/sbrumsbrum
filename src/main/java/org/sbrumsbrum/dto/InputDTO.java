package org.sbrumsbrum.dto;

public class InputDTO<T> {
	
	private T value;

	public InputDTO(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
}
