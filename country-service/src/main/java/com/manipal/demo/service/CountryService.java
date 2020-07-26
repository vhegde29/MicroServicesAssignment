package com.manipal.demo.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

//import com.dxcmanipal.demo.bean.MoneyCalculationBean;
import com.manipal.demo.dao.CountryDao;
import com.manipal.demo.model.Capital;
import com.manipal.demo.model.Country;
import com.manipal.demo.proxy.CapitalProxy;

@Service
public class CountryService {

	//private final String CAPITALSERVICEURI = "http://localhost:8000/capital-service/code/{code}";

	@Autowired
	private CountryDao dao;

	@Autowired
	private CapitalProxy capitalproxy;


	public Capital getCapitalDetails(String code) {
		Capital capital=capitalproxy.getCapital(code);
		//getting conversion multiple to calculate
		
		return capital;
		 } 
	

	//	
	//	  public Capital getCapitalDetails(String code) { Map<String, String>
	//	  uriVariable = new HashMap<>(); uriVariable.put("code", code);
	//	  ResponseEntity<Capital> responseEntity = new
	//	  RestTemplate().getForEntity(CAPITALSERVICEURI, Capital.class, uriVariable);
	//	  Capital model = responseEntity.getBody(); return model; }


	public Country getCountryDetails(String name) {
		return dao.getCountryDetails(name);
	}

	public Country addCountry(Country model) {
		return dao.addCountry(model);
	}

}
