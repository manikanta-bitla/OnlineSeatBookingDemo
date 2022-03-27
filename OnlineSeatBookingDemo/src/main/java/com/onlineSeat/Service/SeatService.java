package com.onlineSeat.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.onlineSeat.Model.Seat;
import com.onlineSeat.Repository.SeatRepo;

@Service
@Component
public class SeatService {
	
	@Autowired
	SeatRepo repo;
	
	public Seat addSeat(Seat s) {
		
		return repo.save(s);
}



}
