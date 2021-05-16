package com.weather.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class WeatherForecastNotFoundException extends Exception{

    private static final long serialVersionUID = 1L;

    public WeatherForecastNotFoundException(String message){
        super(message);
    }
}
