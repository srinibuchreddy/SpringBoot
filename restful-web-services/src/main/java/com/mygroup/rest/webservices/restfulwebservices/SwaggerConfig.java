package com.mygroup.rest.webservices.restfulwebservices;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	//Bean - Docket
	//Swagger 2
	//All the paths
	//All the apis
	
	@Bean
	//This creates Swagger API documentation
	public Docket api() {
	
		return new Docket(DocumentationType.SWAGGER_2);
	}
	
}
