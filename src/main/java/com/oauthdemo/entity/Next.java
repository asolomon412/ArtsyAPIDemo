package com.oauthdemo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Next {

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
		return "Next [href=" + ref + "]";
	}
	
	// keep this just in case 
//	public void setRef(String ref2) {
//		String[] getCursor = ref2.split("=");
//		ref = getCursor[1];
//	}
}
