package com.shiprate.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:config-ups.yaml")
@Data
public class UpsConfig {

	@Value("${account_number}")
	private String accountNumber;

	@Value("${api_client_id}")
	private String clientID;

	@Value("${api_secret}")
	private String secret;

	public UpsConfig() {

	}
}
