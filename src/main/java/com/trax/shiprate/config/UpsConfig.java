package com.trax.shiprate.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Data
@Configuration
@PropertySource("classpath:app_config_ups.properties")
public class UpsConfig {

	@Value("${token.api.url}")
	private String tokenUrl;

	@Value("${token.api.client}")
	private String clientId;

	@Value("${token.api.secret}")
	private String secretId;

	@Value("${api.valid.client.url}")
	private String validateClientUrl;

	@Value("${refresh.api.url}")
	private String refreshUrl;

	@Value("${redirect.url}")
	private String redirectUrl;

	@Value("${api.response_type}")
	private String code;

	@Value("${api.type}")
	private String type;

	@Value("${api.scope}")
	private String scope;

	@Value("${api.state}")
	private String state;

	@Value("${api.base.url}")
	private String upsurl;

	@Value("${api.valid.client.url}")
	private String authorizeUrl;
}
