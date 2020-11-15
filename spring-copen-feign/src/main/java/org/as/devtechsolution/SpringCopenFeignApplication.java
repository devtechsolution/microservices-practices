package org.as.devtechsolution;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringCopenFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCopenFeignApplication.class, args);
	}

}
