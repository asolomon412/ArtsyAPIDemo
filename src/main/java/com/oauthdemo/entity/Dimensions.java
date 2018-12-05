package com.oauthdemo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Dimensions {
	private Inches in;

	public Inches getIn() {
		return in;
	}

	public void setIn(Inches in) {
		this.in = in;
	}

	@Override
	public String toString() {
		return "Dimensions [in=" + in + "]";
	}
	
	

}
