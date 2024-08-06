package com.capgemini.in.RatingService.dao;

import java.util.List;
import java.util.Optional;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.in.RatingService.entity.Rating;

public interface RaitingRepository extends CrudRepository<Rating,String>{
	List<Rating> findByUserId(String userId);
    List<Rating> findByHotelId(String hotelId);
    
	
}

