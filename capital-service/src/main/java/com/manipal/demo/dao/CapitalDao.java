package com.manipal.demo.dao;

import java.util.List;

import com.manipal.demo.model.CapitalModel;

public interface CapitalDao {
	
	String addCapital(CapitalModel capital);
	CapitalModel getByZipcode(String zipcode);
	List<CapitalModel> getCapitals();
	CapitalModel getByCountryCode(String code);
}