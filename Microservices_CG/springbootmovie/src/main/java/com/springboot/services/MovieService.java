package com.springboot.services;

import java.util.List;

import com.springboot.dto.MovieDTO;
import com.springboot.entities.Movie;

public interface MovieService {
	
	List<Movie> getAll();
	List<MovieDTO> getProjection(); 
	Movie InsertMovieIntoDatabase(Movie movie);
}
