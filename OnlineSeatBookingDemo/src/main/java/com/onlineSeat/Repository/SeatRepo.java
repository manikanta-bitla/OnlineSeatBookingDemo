package com.onlineSeat.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.onlineSeat.Model.Seat;

@Repository
public interface SeatRepo extends CrudRepository<Seat, Integer> {
	
	
	


}
