package com.hsbc.hbar.mdw.financialaccounting;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@SpringBootApplication
@EnableEurekaClient
@EnableAutoConfiguration
public class FinancialaccountingApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinancialaccountingApplication.class, args);
	}
	
	@Bean
	public OpenAPI customOpenAPI(@Value("V1") String appVersion) {
		return new OpenAPI().info(new Info().title("HSBC Financial Accounting API")
				.version(appVersion)
				.description("API to manage Financial Accounting")
				.termsOfService("http://swagger.io/terms/")
				.license(new License().name("Apache 2.0").url("http://sprindoc.org")));
	}

}
