package com.capgemini.in.RatingService.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.in.RatingService.dao.RaitingRepository;
import com.capgemini.in.RatingService.entity.Rating;

public interface RatingService {
	Rating create(Rating rating);
	List<Rating>getAllRating();
	//get all by UserId
    List<Rating> getRatingByUserId(String userId);

    //get all by hotel
    List<Rating> getRatingByHotelId(String hotelId);

	
	
	
	
}
	
	
