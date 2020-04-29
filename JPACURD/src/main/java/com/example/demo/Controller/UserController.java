package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.User;
import com.example.demo.UserService.UserService;


@RestController
public class UserController {
	
   @Autowired	
   private	UserService userService;
	
   @PostMapping("createUser")
	public void createUser(@RequestBody User user) {
	 userService.createUser(user); 
	}
   
   @GetMapping("getUsers")
	public List<User> getUsers() {
	 return userService.getUsers();
	}
   
   @GetMapping("getUserById/{id}")
	public Optional<User> getUserById(@PathVariable int id) {
	 return userService.getUserById(id);
	}
   
   @DeleteMapping("deleteUserById/{id}")
	public void deleteUserById(@PathVariable int id) {
	  userService.deleteUserById(id);
	}
   
   @DeleteMapping("deleteallUser")
  	public void deleteUserById() {
  	  userService.deleteallUser();
  	}
   
}