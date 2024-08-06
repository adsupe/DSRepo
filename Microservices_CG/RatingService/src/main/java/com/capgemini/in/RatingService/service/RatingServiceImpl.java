package com.capgemini.in.RatingService.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.capgemini.in.RatingService.dao.RaitingRepository;
import com.capgemini.in.RatingService.entity.Rating;

@Service
public class RatingServiceImpl implements RatingService{
	@Autowired
    RaitingRepository ratingRepo;
    
	@Override
	public Rating create(Rating rating) {
		// TODO Auto-generated method stub
		String randomRatingId = UUID.randomUUID().toString();
		rating.setRatingId(randomRatingId);
		return (Rating)ratingRepo.save(rating);
	}

	@Override
	public List<Rating> getAllRating() {
		// TODO Auto-generated method stub
		return (List<Rating>) ratingRepo.findAll();
	}

	@Override
	public List<Rating> getRatingByUserId(String userId) {
		// TODO Auto-generated method stub
		return ratingRepo.findByUserId(userId);
    }
	

	@Override
	public List<Rating> getRatingByHotelId(String hotelId) {
		// TODO Auto-generated method stub
		return ratingRepo.findByHotelId(hotelId);
	}

	

}
