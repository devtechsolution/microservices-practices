package org.as.devtechsolution;

import org.as.devtechsolution.client.ExcangeMethodClient;
import org.as.devtechsolution.client.ForEntityMethodOfRestTemplateDemo;
import org.as.devtechsolution.client.ForObjectMethodOfRestTemplateDemo;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

//@SpringBootApplication
public class UserManagementClientRestTemplateApplication {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		//SpringApplication.run(UserManagementClientRestTemplateApplication.class, args);
		ExcangeMethodClient e= new ExcangeMethodClient();
		e.useExchangeMethodsOfRestTemplate();
		ForEntityMethodOfRestTemplateDemo forEntityMethodOfRestTemplateDemo = new ForEntityMethodOfRestTemplateDemo();
        forEntityMethodOfRestTemplateDemo.driverMethod();
        ForObjectMethodOfRestTemplateDemo forObjectMethodOfRestTemplateDemo = new ForObjectMethodOfRestTemplateDemo();
        forObjectMethodOfRestTemplateDemo.driverMethod();
	
	}
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
