package com.springboot.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.springboot.entities.Movie;
import com.springboot.projections.MovieProjections;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

//	@Query("select m.id as id,m.name as name,m.rating as rating ,m.director as director from Movie m")
//	List<MovieProjections> getAllProjections();
	
	@Query(value = "select id,name,rating,director from movie", nativeQuery = true)
	List<MovieProjections> getAllProjections();
	
}
