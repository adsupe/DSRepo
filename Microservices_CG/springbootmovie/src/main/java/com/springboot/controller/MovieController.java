package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.dto.MovieDTO;
import com.springboot.entities.Movie;
import com.springboot.services.MovieService;

@RestController
@RequestMapping("/api/v1/movie")
public class MovieController {

	@Autowired
	private MovieService service;

	@GetMapping("/all")
	public ResponseEntity<List<Movie>> getAllMovies(){
		return new ResponseEntity<List<Movie>>(service.getAll(), HttpStatus.OK);
	}
	
	@GetMapping("/projections")
	public ResponseEntity<List<MovieDTO>> getAllMovieProjections(){
		return new ResponseEntity<List<MovieDTO>>(service.getProjection(), HttpStatus.OK);
	}
	
	@PostMapping("/insert")
	public Movie insertMovieInDb(@RequestBody Movie movie) {
        return  service.InsertMovieIntoDatabase(movie);
	}
	
}
