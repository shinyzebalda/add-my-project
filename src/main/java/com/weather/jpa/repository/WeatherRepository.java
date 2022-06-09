package com.weather.jpa.repository;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.weather.jpa.domain.WeatherReport;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

//Fill your code here

@Repository("weatherRepository")
public interface WeatherRepository extends JpaRepository<WeatherReport, Long>{
//    public List<WeatherReport> getData();
//	
//	public WeatherReport addWeatherReport( @RequestBody WeatherReport cases );
//	
//	public WeatherReport updateWeatherReport( @RequestBody WeatherReport cases );
//	
//	public WeatherReport view(@PathVariable Long id);
//	
//	public Boolean deleteUsers(@PathVariable Long id);
//




}