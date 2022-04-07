package com.SpringMapping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.SpringMapping.Model.User;

@SpringBootApplication
public class SpringCrud2DtoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCrud2DtoApplication.class, args);
	
	User u=new User();
	System.out.println(u);
	
	}

}
