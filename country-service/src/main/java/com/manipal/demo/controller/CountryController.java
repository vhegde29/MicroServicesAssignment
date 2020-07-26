package com.manipal.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.manipal.demo.model.Capital;
import com.manipal.demo.model.Country;
import com.manipal.demo.service.CountryService;

@RestController
public class CountryController {

	@Autowired
	private CountryService service;
	


	@GetMapping("/countryname/{countryName}")
	public Country getDetail(@PathVariable String countryName) {
		Country country = service.getCountryDetails(countryName);
		String countryCode = country.getCountryCode();
		Capital model = service.getCapitalDetails(countryCode);
		

		country.setCapital(model);
		return country;	
	}
	
	@PutMapping("/add")
	public Country addCountry(@RequestBody Country model) {
		return service.addCountry(model);
	}

}
