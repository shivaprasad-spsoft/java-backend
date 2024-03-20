package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CountriesController {
	
	
	@GetMapping("/api/countries")
	public ResponseEntity<?> getCountries(){
		
		
		RestTemplate rt=new RestTemplate();
		
		return rt.getForEntity("https://restcountries.com/v3.1/all", String.class);
		
		//return null;
	}
	@GetMapping("/api/countries/{name}")
	public ResponseEntity<?> getCountriesByName(@PathVariable String name){
		
		
		RestTemplate rt=new RestTemplate();
		
		return rt.getForEntity("https://restcountries.com/v3.1/all", String.class);
		
		//return null;
	}
}
