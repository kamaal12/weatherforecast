package com.weather.demo.exception;

import java.util.logging.Logger;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.weather.demo.controller.WeatherForecastController;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class WeatherForecastNotFoundException extends Exception{
	

    private static final long serialVersionUID = 1L;

    public WeatherForecastNotFoundException(String message){
        super(message);
    }
}
