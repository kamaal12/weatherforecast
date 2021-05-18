/**
 * 
 */
package com.weather.demo.controller;


import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


import com.weather.demo.svc.WeatherForecastRetrieval;

import org.junit.Before;
import org.junit.Test;

/**
 * @author kamaal
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@AutoConfigureMockMvc
public class WeatherForecastControllerTest {
	
	private MockMvc mvc;
	
	@InjectMocks
	private  WeatherForecastController weatherForecastController;
	
	
	@Mock
	private WeatherForecastRetrieval weatherForecastRetrieval;
	
	@Before
	public void setUp() throws Exception
	{
		mvc=MockMvcBuilders.standaloneSetup(weatherForecastController).build();
	}
	
	
	@Test
	public void testWeatherForecastAverage() throws Exception{
		
		
		MvcResult rs=mvc.perform(get("/weather/forecast").param("zip", "").contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk()).andReturn();
	}
}
