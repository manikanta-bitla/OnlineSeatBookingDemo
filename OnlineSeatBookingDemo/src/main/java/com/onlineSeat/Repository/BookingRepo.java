package com.onlineSeat.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.onlineSeat.Model.Booking;

@Repository

public interface BookingRepo extends CrudRepository<Booking, Integer> {

	
	
	
	
	
}

