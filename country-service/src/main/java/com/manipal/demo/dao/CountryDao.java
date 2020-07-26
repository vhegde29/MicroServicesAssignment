package com.manipal.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.manipal.demo.model.Country;
import com.manipal.demo.repository.CountryRepository;

@Component
public class CountryDao {
	
	@Autowired
	private CountryRepository repo;
	
	public Country addCountry(Country model) {
		return repo.save(model);
	}
	
	public Country getCountryDetails(String name) {
		return repo.findByCountryName(name);
	}

}

