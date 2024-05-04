package com.practicee.serversidevalidation.entities;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class Login {
	@NotBlank(message = "User name cannot be empty")
	@Size(min = 3, max = 15, message = "User name must be between 3 - 15 characters !!")
	private String name;
	
	@NotBlank(message = "Email cannot be empty")
	@Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message = "Invalid email address.")
	private String email;
	
	@NotBlank(message = "Password cannot be empty")
	private String password;
	
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Login(String name, String email, String password) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Login [name=" + name + ", email=" + email + ", password=" + password + "]";
	}
	
	
}
