package com.SpringMapping.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringMapping.Model.User;
import com.SpringMapping.Repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	
	public User saveUser(User user) {
		
		return userRepository.save(user);
	}

	
	public  List<User> saveAllUser(List<User> user){
		return userRepository.saveAll(user);
	}
	
	 public User findUserById(int id) {
		
		return userRepository.findById(id).orElse(null);
				 
	 }
	 public String DeletedById(int id) {
		 userRepository.deleteById(id);
		 return "Deleted ID id "+id;
	 }
}
