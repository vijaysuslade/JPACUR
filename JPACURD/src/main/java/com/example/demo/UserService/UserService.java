package com.example.demo.UserService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.User;
import com.example.demo.Repo.UserRepo;


@Service
public class UserService {

	@Autowired
	private UserRepo userRepo;
	
	public void createUser(User user) {
     userRepo.save(user);	
	}

	public List<User> getUsers() {
	
		return  userRepo.findAll();
	}

	public Optional<User> getUserById(int id) {
	return userRepo.findById(id);
    	
	}

	public void deleteUserById(int id) {
    userRepo.deleteById(id);
	}

	public void deleteallUser() {
    userRepo.deleteAll();		
	}

	

}
