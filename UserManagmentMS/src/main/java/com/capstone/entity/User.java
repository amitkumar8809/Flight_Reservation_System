package com.capstone.entity;

import jakarta.persistence.Entity;
import lombok.Data;


@Data
public class User {
	private Long id;
	private String firstName;
	private String lastName;
	private String mobileNumber;
	private String email;

}
