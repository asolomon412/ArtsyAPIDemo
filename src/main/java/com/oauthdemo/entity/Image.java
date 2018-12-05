package com.oauthdemo.entity;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Image {
	@JsonProperty("href")
	private String img;

	public String getImg() {
		return img;
	}

	public void setImg(String img2) {
		String[] hrefSplit = img2.split("[{}]");
		System.out.println(Arrays.toString(hrefSplit));

		img = hrefSplit[0] + "small" + ".jpg";
	
	}

	@Override
	public String toString() {
		return "Image [img=" + img + "]";
	}

	// public String getHref() {
	// String[] hrefFirstSplit = href.split("{");
	// String[] hrefEndSplit = href.split(".");
	//
	// href = hrefFirstSplit[0] + 2 + "." + hrefEndSplit[0];
	// return href;
	// }
	//
	// public void setHref(String href) {
	// this.href = href;
	// }
	//
	// @Override
	// public String toString() {
	// return "Image [href=" + href + "]";
	// }

}
