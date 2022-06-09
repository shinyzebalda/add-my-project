package com.weather.jpa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.weather.jpa.domain.WeatherReport;
import com.weather.jpa.repository.WeatherRepository;

//Fill your code here
@RestController
public class WeatherController {
    
	//Fill your code here
	@Autowired
	WeatherRepository rep;
	
	//Fill your code here
	@GetMapping("/weatherReport")
	public List<WeatherReport> getData() {
		//Fill your code here
		return rep.findAll();
	}
	
	//Fill your code here
	@PostMapping("/weatherReport")
	public WeatherReport addWeatherReport( @RequestBody WeatherReport cases ) {
		//Fill your code here
		return rep.save(cases);
	}
	
	//Fill your code here
	@PutMapping("/weatherReport")
	public WeatherReport updateWeatherReport( @RequestBody WeatherReport cases ) {
		//Fill your code here
		return rep.save(cases);
		
	}
	
	//Fill your code here
	@GetMapping("/weatherReport/{id}")
	public WeatherReport view(@PathVariable("id") Long id) {
		//Fill your code here
		WeatherReport wep = null;
		 Optional opt = rep.findById(id);
		 wep = (WeatherReport) opt.get();
		 
		 return wep;
	}
	
	//Fill your code here
	
	@DeleteMapping("/weatherReport/{id}")
	public Boolean deleteUsers(@PathVariable("id") Long id) {
		//Fill your code here
		Boolean flag = true;
		try {
			
		
		rep.deleteById(id);
		
		}
		catch (Exception e) {
			// TODO: handle exception
			flag= false;
		}
		
		return flag;
	}
	
}