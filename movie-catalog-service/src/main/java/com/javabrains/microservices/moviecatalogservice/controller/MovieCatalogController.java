package com.javabrains.microservices.moviecatalogservice.controller;

import java.util.List;
import java.util.stream.Collectors;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



import com.javabrains.microservices.moviecatalogservice.model.Catalog;
import com.javabrains.microservices.moviecatalogservice.model.Movie;
import com.javabrains.microservices.moviecatalogservice.model.UserRating;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	//@Autowired
	//private DiscoveryClient discoveryClient;
	
	@GetMapping("/{userId}")
	public List<Catalog> getCatalogs(@PathVariable("userId") String userId){
		
		
		UserRating userRating = restTemplate.getForObject("http://ratings-data-service/ratings/"+ userId,UserRating.class);
		
		List<Catalog> catalogList = userRating.getRatings().stream().map(rating -> {
			Movie movie = restTemplate.getForObject("http://movie-info-service/movies/"+rating.getMovieId(), Movie.class);
			return new Catalog(movie.getMovieId(),movie.getMovieName(), movie.getMovieDesc(), rating.getRating());
		}).collect(Collectors.toList());
		
		return catalogList;
	}
}
