package org.as.devtechsolution;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class EhospitalZuulApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(EhospitalZuulApiGatewayApplication.class, args);
	}

}
