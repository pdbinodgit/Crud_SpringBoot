package com.SpringMapping.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
		return userService.SaveAllUser(user);
	}
	@GetMapping("/find")
	public User Find(int id) {
		return userService.FindUserById(id);
	}
	@DeleteMapping("/Deleted")
	public String Deleted(int id) {
		return userService.DeletedById(id);
		
	}
	
}
