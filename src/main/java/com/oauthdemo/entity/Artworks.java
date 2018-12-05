package com.oauthdemo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Artworks {

	private String id;
	private String title;
	private String medium;
	private String date;
	private Dimensions dimensions;
	@JsonProperty("_links")
	private Links links;
	private String category;


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMedium() {
		return medium;
	}

	public void setMedium(String medium) {
		this.medium = medium;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Dimensions getDimensions() {
		return dimensions;
	}

	public void setDimensions(Dimensions dimensions) {
		this.dimensions = dimensions;
	}

	public Links getLinks() {
		return links;
	}
//
//	public void set_links(Links links) {
//		this.links = links;
//	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	

	public void setLinks(Links links) {
		this.links = links;
	}

	@Override
	public String toString() {
		return "Artworks [id=" + id + ", title=" + title + ", medium=" + medium + ", date=" + date + ", dimensions="
				+ dimensions + ", _links=" + links + ", category=" + category + "]";
	}

}
