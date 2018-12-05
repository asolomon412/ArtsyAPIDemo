package com.oauthdemo.entity;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Embedded {
	
	ArrayList<Artworks> artworks;

	public ArrayList<Artworks> getArtworks() {
		return artworks;
	}

	public void setArtworks(ArrayList<Artworks> artworks) {
		this.artworks = artworks;
	}

	@Override
	public String toString() {
		return "Embedded [artworks=" + artworks + "]";
	}
	
	

}
