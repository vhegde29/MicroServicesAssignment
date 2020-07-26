package com.manipal.demo.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.manipal.demo.model.Capital;




@FeignClient(name = "capital-service" ,url="http://localhost:8000")
@RibbonClient(name = "capital-service")
public interface CapitalProxy {
	@GetMapping("capital-service/code/{code}")
	public Capital getCapital(@PathVariable String code);
	
}
