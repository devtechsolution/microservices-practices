package org.as.devtechsolution.config;

import java.time.Duration;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.boot.web.client.RootUriTemplateHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriTemplateHandler;

@Configuration
public class Config {	
	

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		UriTemplateHandler uriTemplateHandler= new RootUriTemplateHandler("http://localhost:8083/springData");
		
		//return builder.build();
		return builder
				.uriTemplateHandler(uriTemplateHandler)
				.setReadTimeout(Duration.ofMillis(1000))
				.build();
	}
}
