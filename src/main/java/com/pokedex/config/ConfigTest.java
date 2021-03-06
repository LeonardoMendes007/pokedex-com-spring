package com.pokedex.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.pokedex.service.BDService;

@Configuration
@Profile("test")
public class ConfigTest{

	@Autowired
	private BDService service;
	

	@Bean
	public void initBD() {
		
		service.initDataBase();
		
	}

}
