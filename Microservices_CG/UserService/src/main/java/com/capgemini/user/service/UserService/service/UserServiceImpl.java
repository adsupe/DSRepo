package com.capgemini.user.service.UserService.service;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.capgemini.user.service.UserService.entity.Hotel;
import com.capgemini.user.service.UserService.entity.Rating;
import com.capgemini.user.service.UserService.entity.User;
import com.capgemini.user.service.UserService.externalservices.HotelService;
import com.capgemini.user.service.UserService.externalservices.RatingService;
import com.capgemini.user.service.UserService.repository.UserRepository;


@Service
public class UserServiceImpl implements UserService {
	@Autowired
   UserRepository userRepo;
	@Autowired
	RestTemplate restTemplate;
	 @Autowired
	    private HotelService hotelService;
	
	@Autowired 
	private RatingService ratingServiceProxy;
	private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		String randomUserId = UUID.randomUUID().toString();
		user.setUserId(randomUserId);
		return userRepo.save(user);
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		
		return userRepo.findAll();
	}

	@Override
	public User getUser(String userId) {
		//http://localhost:8051/ratings/users/dc83bfa6-da67-4a7d-90b9-b536f01b9527
		// TODO Auto-generated method stub
		User user = userRepo.findById(userId).orElseThrow(()->new ArithmeticException("User with given id does not exist in the server"));
		 //User user = userRepo.findById(userId).orElseThrow(() -> new ArithmeticException("User with given id is not found on serve"));
     	
	        // fetch rating of the above  user from RATING SERVICE
	        //http://localhost:8083/ratings/users/47e38dac-c7d0-4c40-8582-11d15f185fad

	        Rating[] ratingsOfUser = restTemplate.getForObject("http://localhost:8051/ratings/users/" + user.getUserId(), Rating[].class);
			List<Rating> ratings = Arrays.stream(ratingsOfUser).toList();
//			ResponseEntity<List<Rating>> ratings = ratingServiceProxy.getRatingsByUserId(user.getUserId());
	        //logger.info("{} ", ratingsOfUser);
	        
	        List<Rating> ratingList = ratings.stream().map(rating -> {
	            //api call to hotel service to get the hotel
	            //http://localhost:8082/hotels/1cbaf36d-0b28-4173-b5ea-f1cb0bc0a791
	            //ResponseEntity<Hotel> forEntity = restTemplate.getForEntity("http://HOTEL-SERVICE/hotels/"+rating.getHotelId(), Hotel.class);
	            Hotel hotel = hotelService.getHotel(rating.getHotelId());
	            // logger.info("response status code: {} ",forEntity.getStatusCode());
	            //set the hotel to rating
	            rating.setHotel(hotel);
	            //return the rating
	            return rating;
	        }).collect(Collectors.toList());

	        user.setRating(ratingList);

	        return user;

	       
		        
		        
		
		
		
	}

	}
