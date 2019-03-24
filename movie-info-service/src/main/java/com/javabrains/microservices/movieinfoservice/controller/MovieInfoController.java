package com.javabrains.microservices.movieinfoservice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javabrains.microservices.movieinfoservice.model.Movie;

@RestController
@RequestMapping("/movies")
public class MovieInfoController {
	
	@GetMapping("/{movieId}")
	public Movie getMovies(@PathVariable("movieId") String movieId){
		Movie movie = new Movie(movieId,"Transformers","About Transformers");
		return movie;
	}

}
