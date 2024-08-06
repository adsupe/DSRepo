package com.capgemini.in.HotelService.service;

import java.util.List;

import com.capgemini.in.HotelService.entity.Hotel;

public interface HotelService {
	
	//create
	
	public Hotel create(Hotel hotel);
	
	
	//getAll
	public List<Hotel>getAllHotels();
	
	//getOne
	public Hotel getHotelById(String Id);

}
