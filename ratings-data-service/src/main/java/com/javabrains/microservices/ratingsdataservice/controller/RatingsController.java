package com.javabrains.microservices.ratingsdataservice.controller;

import java.util.List;
import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javabrains.microservices.ratingsdataservice.model.MovieRating;
import com.javabrains.microservices.ratingsdataservice.model.UserRating;

@RestController
@RequestMapping("/ratings")
public class RatingsController {
	
	/*@GetMapping("/{movieId}")
	public MovieRating getRatings(@PathVariable("movieId") String movieId){
		MovieRating movieRating = new MovieRating(movieId,"4");
		return movieRating;
	}*/
	
	
	@GetMapping("/{userId}")
	public UserRating getRatings(@PathVariable("userId") String userId){
		List<MovieRating> ratings = Arrays.asList(
				new MovieRating("1111","4"), 
				new MovieRating("2222","4")
			);
		
		UserRating userRating = new UserRating();
		userRating.setUserId(userId);
		userRating.setRatings(ratings);
		return userRating;
	}
}
