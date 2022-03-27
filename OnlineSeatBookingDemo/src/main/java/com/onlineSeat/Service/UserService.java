package com.onlineSeat.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineSeat.Model.User;
import com.onlineSeat.Repository.UserRepo;

@Service
public class UserService {
	@Autowired
	UserRepo repo;
	
	
	public User addUser(User u) {
		
		return repo.save(u);

}
	
}
