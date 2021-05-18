/**
 * 
 */
package com.weather.demo.svc;

/**
 * @author kamaal
 *
 */
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import com.weather.demo.svc.WeatherForecastRetrieval;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
public class WeatherForecastRetrievalTest {

	@Autowired
	private WeatherForecastRetrieval weatherForecastRetrieval; 

	@Mock
	private  RestTemplate restTemplate;

	@Test
	public void testWeatherForecastAverageException() {
		weatherForecastRetrieval.weatherForecastAverage("94090");
	}
	
	@Test
	public void testWeatherForecastAverage() {
		weatherForecastRetrieval.weatherForecastAverage("94090");
	}
}