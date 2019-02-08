package com.example.login;

import com.example.login.controller.LoginController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoginApplication {

	@Autowired
	LoginController service;

	public static void main(String[] args) {
		SpringApplication.run(LoginApplication.class, args);
	}

}

