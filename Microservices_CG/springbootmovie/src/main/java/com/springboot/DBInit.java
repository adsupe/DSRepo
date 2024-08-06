package com.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.springboot.dao.MovieRepository;
import com.springboot.entities.Movie;

//@Component
public class DBInit implements CommandLineRunner {
	
	@Autowired
	private MovieRepository repository;

	@Override
	public void run(String... args) throws Exception {
		repository.save(new Movie("don", "5", "sumeet", "2:30", "hindi"));
		repository.save(new Movie("don", "5", "sumeet", "2:30", "hindi"));
		repository.save(new Movie("don", "5", "sumeet", "2:30", "hindi"));
	}

}
