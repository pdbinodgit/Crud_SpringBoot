package com.SpringMapping.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.SpringMapping.Model.User;
import com.SpringMapping.Service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	@PostMapping("/save")
	public User saveUser(@RequestBody User user) {
		
		return userService.saveUser(user);
	}
    @PostMapping("/SaveAll")
	public List<User> saveAllUser(@RequestBody List<User> user) {
		return userService.saveAllUser(user);
	}
	@GetMapping("/find")
	public User Find(int id) {
		return userService.findUserById(id);
	}
	@DeleteMapping("/Deleted/{id}")
	public String Deleted(@PathVariable int id) {
		return userService.DeletedById(id);
		
	}
	
}
