package com.oauthdemo.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Self {
	@JsonProperty("href")
	private String ref;

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	@Override
	public String toString() {
		return "Self [href=" + ref + "]";
	}

}
