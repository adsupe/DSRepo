package com.capgemini.in.HotelService.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.in.HotelService.dao.HotelRepository;
import com.capgemini.in.HotelService.entity.Hotel;
import com.capgemini.in.HotelService.exception.ResourceNotFoundException;
@Service
public class HotelServiceImpl implements HotelService {
	@Autowired
  HotelRepository hotelRepo;
	@Override
	public Hotel create(Hotel hotel) {
		// TODO Auto-generated method stub
		String randomUserId = UUID.randomUUID().toString();
		hotel.setId(randomUserId);
		return hotelRepo.save(hotel);
		
	}

	@Override
	public List<Hotel> getAllHotels() {
		// TODO Auto-generated method stub
		List<Hotel> hotelList = hotelRepo.findAll();
		
		return hotelList;
	}

	@Override
	public Hotel getHotelById(String Id) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		return hotelRepo.findById(Id). orElseThrow(() -> new ResourceNotFoundException());
	}

}
