package com.elements.demo.insurance;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
/**
 * This class makes it possible to deploy the application as a war file
 * Not needed with embedded tomcat
 * @author Shamaila Mahmood
 *
 */
public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(InsuranceApplication.class);
	}

}
