package com.weather.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
//@TestPropertySource(locations= {"classpath:test-configuration.properties"})
public class WeatherForecastDemoApplicationTest {

	@Test
	public void contextLoads() {
	}
	
	 @Test
	   public void main() {
		 WeatherForecastDemoApplication.main(new String[] {});
	   }

}
