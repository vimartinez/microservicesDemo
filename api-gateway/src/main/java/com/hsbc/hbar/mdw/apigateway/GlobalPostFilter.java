package com.hsbc.hbar.mdw.apigateway;

import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@Slf4j
@Configuration
public class GlobalPostFilter {
	
	@Bean
	public GlobalFilter postGlobalFilter() {
		return(exchange, chain) -> {
			return chain.filter(exchange)
			.then(Mono.fromRunnable(() -> {
				log.info("PostFilter en API Gateway");
			}));
		};
	}

}
