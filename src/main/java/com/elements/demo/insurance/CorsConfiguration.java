package com.elements.demo.insurance;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class CorsConfiguration extends WebMvcConfigurerAdapter {

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/api/**").
		allowedOrigins("http://localhost:4200").
		//allowCredentials(true).
        allowedMethods("*").
		allowedHeaders("*");
	}

}
