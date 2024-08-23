package com.makersharks.config;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {

	@Bean
	public Docket getDocket()
	{
		ApiInfo apiInfo = new ApiInfo("Supplier Search App", "Supplier search app for searching manufacturers", "1.0", "http://www.makershark.com",
				new Contact("Makershark", "http://www.makershark.com", "makershark@gmail.com"), "TY-2023",
				"http://www.makershark.com", new ArrayList<>());

		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.makersharks")).build().apiInfo(apiInfo)
				.useDefaultResponseMessages(true);
	}

}
