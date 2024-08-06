package com.springboot.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springboot.dao.MovieRepository;
import com.springboot.dto.MovieDTO;
import com.springboot.entities.Movie;
import com.springboot.projections.MovieProjections;

@Component
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieRepository repository;

	@Override
	public List<Movie> getAll() {
		return repository.findAll();
	}

	@Override
	public List<MovieDTO> getProjection() {
		List<MovieProjections> movieProjections = repository.getAllProjections();
		List<MovieDTO> movieDTOs = new ArrayList<>();
		for(MovieProjections projections : movieProjections) {
			movieDTOs.add(new MovieDTO(projections.getId(), projections.getName(), projections.getRating(), projections.getDirector()));
		}
		return movieDTOs;
	}

	@Override
	public Movie InsertMovieIntoDatabase(Movie movie) {
		// TODO Auto-generated method stub
		
		return repository.save(movie);
	}

	
	

	
}
