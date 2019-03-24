package com.javabrains.microservices.moviecatalogservice.model;

import java.util.List;


public class UserRating {
	
	private String userId;
	private List<MovieRating> ratings;
	
	public UserRating(){
		
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public List<MovieRating> getRatings() {
		return ratings;
	}
	public void setRatings(List<MovieRating> ratings) {
		this.ratings = ratings;
	}
	

}
