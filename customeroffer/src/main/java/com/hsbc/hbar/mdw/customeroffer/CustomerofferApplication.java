package com.hsbc.hbar.mdw.customeroffer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@SpringBootApplication
@EnableEurekaClient
@EnableAutoConfiguration
public class CustomerofferApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerofferApplication.class, args);
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	@Bean
	public OpenAPI customOpenAPI(@Value("V1") String appVersion) {
		return new OpenAPI().info(new Info().title("HSBC MDW Customer Offer API")
				.version(appVersion)
				.description("API to manage Custom Offers BIAN Model")
				.termsOfService("http://swagger.io/terms/")
				.license(new License().name("Apache 2.0").url("http://sprindoc.org")));
	}

}
