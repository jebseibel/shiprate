package com.shiprate.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Data
@Configuration
@PropertySource("classpath:app_config_ups.yaml")
public class UpsConfig {
	@Value("${account_number}")
	private String accountNumber;

	@Value("${client_id}")
	private String clientId;

	@Value("${secret}")
	private String secret;
}
