package com.javabrains.microservices.ratingsdataservice.model;

import java.util.List;


public class UserRating {
	
	private String userId;
	private List<MovieRating> movieratings;
	
	public UserRating(){
		
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public List<MovieRating> getRatings() {
		return movieratings;
	}
	public void setRatings(List<MovieRating> movieratings) {
		this.movieratings = movieratings;
	}
	

}
