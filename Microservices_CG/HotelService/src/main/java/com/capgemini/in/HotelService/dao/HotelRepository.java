package com.capgemini.in.HotelService.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.in.HotelService.entity.Hotel;

public interface HotelRepository extends JpaRepository<Hotel,String>{
	

}
