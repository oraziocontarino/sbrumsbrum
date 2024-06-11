package org.sbrumsbrum.dto;

public class IntegerDTO{
	
	private int value;

	public IntegerDTO(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	@Override
    public String toString() {
        return value + "";
    }
}
