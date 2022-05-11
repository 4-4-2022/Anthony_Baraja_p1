package com.gasmileagereimbursement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class ClientInterfaceApplication {

	// private static final Logger log = LoggerFactory.getLogger(ClientInterfaceApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(ClientInterfaceApplication.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

}
