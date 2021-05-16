package com.weather.demo;


import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WeatherForecastDemoApplication {
	Logger logger = Logger.getLogger(WeatherForecastDemoApplication.class.getName());

	public static void main(String[] args) {
		SpringApplication.run(WeatherForecastDemoApplication.class, args);
	}

}
