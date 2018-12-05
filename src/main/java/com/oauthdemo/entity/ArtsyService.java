package com.oauthdemo.entity;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ArtsyService {

	// changed this
	@Value("${artsy.client_secret}")
	private String clientSecret;

	/**
	 * Make an HTTP request to Github's server. Get an access token using the
	 * provided code.
	 */
	public String getArtsyAccessToken() {
		// We'll talk more about rest template in the coming days.
		Map<String, String> params = new HashMap<>();
		// params.put("code", code);
		// changes this
		params.put("client_id", "bf9e42782dd3d9caa1e4"); // change this!
		params.put("client_secret", clientSecret);
		RestTemplate rest = new RestTemplate();
		@SuppressWarnings("unchecked")
		// changed this
		Map<String, String> response = rest.postForObject("https://api.artsy.net/api/tokens/xapp_token", params,
				Map.class);
		//System.out.println(response);
		return response.get("token");
	}

	/**
	 * Make an HTTP request to Github's server. Use the access token to get the user
	 * details.
	 */
	public ArtResults getArtFromArtsyApi(String accessToken) {

		RestTemplate rest = new RestTemplate();
		// Add header info needed by ArtsyAPI
		HttpHeaders header = new HttpHeaders();
		header.add("X-Xapp-Token", accessToken);
		String uri = "https://api.artsy.net/api/artworks?size=150"; // can specify how many a user wants to search for :)
		ResponseEntity<ArtResults> response = rest.exchange(uri, HttpMethod.GET, new HttpEntity<String>(header), ArtResults.class);
		System.out.println(response.getBody());
		return response.getBody();
	}

	// // overloaded method created to pass in the string for the next page of data
//	public ArtResults getArtFromArtsyApi(String accessToken, String nextUrl) {
//
//		// parse url after = to get the cursor string text only
//		String[] parseUrl = nextUrl.split("=");
//		Map<String, String> params = new HashMap<>();
//		// add index 1 because it will be the data after the =
//		// params.put("cursor", parseUrl[1]);
//		params.put("cursor", "4eaefc4976e78f0001009e86%3A4eaefc4976e78f0001009e86");
//		params.put("size", "150");
//
//		RestTemplate rest = new RestTemplate();
//		// Add header info needed by ArtsyAPI
//		HttpHeaders header = new HttpHeaders();
//		header.add("X-Xapp-Token", accessToken);
//
//		String uri = "https://api.artsy.net/api/artworks";
//		ResponseEntity<ArtResults> response = rest.exchange(uri, HttpMethod.GET, new HttpEntity<String>(header),
//				ArtResults.class);
//		System.out.println("Made it here" + response);
//		return response.getBody();
//	}
}