package com.example.demo.Res_Config;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.service.Contact;

public class Swagger {

	public static void main(String [] args) {
		SpringApplication.run(Swagger.class, args);
	}
	
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.example.demo.Controller"))
				.build()
				.apiInfo(getApiInfo())
				;
	}
	
	private ApiInfo getApiInfo() {
		return new ApiInfoBuilder()
				.title("api porductos")
				.contact(new Contact("Fernando Martínez", "no-url", "email"))
				.description("Api_DoctorStrange")
				.build();
	}
	
}
