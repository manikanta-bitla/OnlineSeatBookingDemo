package com.onlineSeat;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.onlineSeat.Model.Booking;
import com.onlineSeat.Repository.BookingRepo;
import com.onlineSeat.Service.BookingService;

//@RunWith(SpringRunner.class)
@SpringBootTest
public class BookingTest {
	
	@MockBean
	private BookingRepo repo;
	
	@Autowired
	private BookingService service;
	
	@Test
	public void saveBooking() {
		
		   Booking booking = new Booking(38, "Approved");
		
		   
			
			when(repo.save(booking)).thenReturn(booking);
			assertEquals(booking,service.addBooking(booking));
	    
	}
	

	
}

