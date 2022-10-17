package com.educandoweb.course.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.course.repositories.UserRepository;

@Configuration
@Profile("teste")
public class TestConfig {

	@Autowired
	private UserRepository userRepository;
}
