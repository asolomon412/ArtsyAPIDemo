package com.oauthdemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.oauthdemo.entity.ArtResults;
import com.oauthdemo.entity.ArtsyService;
import com.oauthdemo.entity.Artworks;

@Controller
public class ArtsyController {

	@Autowired
	ArtsyService artsyService;

	//String nextPage;

	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index");
	}

	// This is the second step in OAuth. After the user approves the login on the
	// github site, it redirects back
	// to our site with a temporary code.
	@RequestMapping("/result")
	public ModelAndView artLists() {
		// First we must exchange that code for an access token.
		String accessToken = artsyService.getArtsyAccessToken();
		//System.out.println(accessToken);
		// Then we can use that access token to get information about the user and other
		// things.
		ArtResults allThingsArt = artsyService.getArtFromArtsyApi(accessToken);
		List<Artworks> artList = allThingsArt.getEmbedded().getArtworks();
		ModelAndView mv = new ModelAndView("art", "art", artList); //artList
		//System.out.println();
		//nextPage = allThingsArt.getLink().getNext().getRef();
		//System.out.println(nextPage);
		// mv.addObject("nextPage", allThingsArt.getLink().getNext());
		return mv;
	}

//	// This is the second step in OAuth. After the user approves the login on the
//	// github site, it redirects back
//	// to our site with a temporary code.
//	@RequestMapping("/next-results")
//	public ModelAndView nextPage() {
//
//		// First we must exchange that code for an access token.
//		String accessToken = artsyService.getArtsyAccessToken();
//		System.out.println(accessToken);
//		// Then we can use that access token to get information about the user and other
//		// things.
//		System.out.println("This is for the next page... " + nextPage);
//		Object allThingsArt = artsyService.getArtFromArtsyApi(accessToken, nextPage);
//		System.out.println(allThingsArt);
////		List<Artworks> artList = allThingsArt.getEmbedded().getArtworks();
////		ModelAndView mv = new ModelAndView("art", "art", artList);//
////		nextPage = allThingsArt.getLink().getNext().getRef();
////		System.out.println(artList);
//
//		//return mv;
//		return new ModelAndView("art", "art", "");
//	}

}