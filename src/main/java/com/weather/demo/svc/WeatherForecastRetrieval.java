package com.weather.demo.svc;

import java.util.logging.Logger;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.weather.demo.model.Root;

import springfox.documentation.spring.web.json.Json;


@Service
public class WeatherForecastRetrieval {
	
	Logger logger = Logger.getLogger(WeatherForecastRetrieval.class.getName());
    private final String URI = "http://api.openweathermap.org/data/2.5/weather";
    private final String API_ID = "886705b4c1182eb1c69f28eb8c520e20";

    private final RestTemplate restTemplate;

    public WeatherForecastRetrieval(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

   // @Cached(expire = 10, timeUnit = TimeUnit.MINUTES)
    public ResponseEntity<?> weatherForecastAverage(String city) {
    	Root weatherMap=new  Root();
        try {
        	 weatherMap = this.restTemplate.getForObject(this.url(city), Root.class);
        } catch (HttpClientErrorException e) {
            return new ResponseEntity<>(new Json(e.getResponseBodyAsString()), e.getStatusCode());
        }

        return new ResponseEntity<>(weatherMap, HttpStatus.OK);
    }

   

    private String url(String city) {
        return String.format(URI.concat("?zip=%s").concat("&appid=%s"), city, API_ID);
    }
}
