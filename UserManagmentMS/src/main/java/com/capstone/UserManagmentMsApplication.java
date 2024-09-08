package com.capstone;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.capstone.entity.User;

@SpringBootApplication
public class UserManagmentMsApplication  implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(UserManagmentMsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	}

}
