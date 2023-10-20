package com.byyun.ri.config;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;

@OpenAPIDefinition(
		info = @Info(title = "catch table API 명세서",
				description = "API 명세서",
				version = "v1"))
@Configuration
public class SwaggerConfig {

	@Bean
	public OpenAPI openAPI(){

		SecurityScheme securityScheme = new SecurityScheme()
				.type(SecurityScheme.Type.HTTP).scheme("bearer").bearerFormat("JWT")
				.in(SecurityScheme.In.HEADER).name("Authorization");
		SecurityRequirement securityRequirement = new SecurityRequirement().addList("bearerAuth");

		return new OpenAPI()
				.components(new Components().addSecuritySchemes("bearerAuth", securityScheme))
				.security(Arrays.asList(securityRequirement));


		//return new OpenAPI().components(new Components()).info(new io.swagger.v3.oas.models.info.Info());
	}

}
