package org.as.devtechsolution.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket swagConfig(){
       return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("org.as.devtechsolution"))
                .build()
               .apiInfo(getApiInfo());
    }

    private ApiInfo getApiInfo() {
    	return new ApiInfo("Order Management REST API",
                "Documentation for orderManagementApp for 3rd party",
                "1.0",
                "Terms of service for using orderManagementApp",
                new Contact("devtechsolution","https://github.com/devtechsolution","aditya5srivastva@gmail.com"),
                "MIT Licence",
                "https://opensource.org/licenses/MIT",
                new ArrayList<>()
        );
    }
}