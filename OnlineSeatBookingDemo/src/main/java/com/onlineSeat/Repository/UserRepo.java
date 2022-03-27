package com.onlineSeat.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.onlineSeat.Model.User;

@Repository
public interface UserRepo extends CrudRepository<User, Integer>{

}
