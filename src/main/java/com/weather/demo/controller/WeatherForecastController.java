package com.weather.demo.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.weather.demo.service.WeatherForecastService;

@RestController
@RequestMapping("weather")
public class WeatherForecastController {

    @Autowired
    private WeatherForecastService weatherForecastService;

    @ApiOperation("Return a JSON object that gives the weather averages.")
    @GetMapping(value = "/forecast", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> weatherForecastAverage(@ApiParam("zip") @RequestParam(required = true) String zip) {
        return weatherForecastService.weatherForecastAverage(zip);
    }
}
