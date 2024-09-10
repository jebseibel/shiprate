package com.shiprate.config;

import lombok.Data;

@Data
public class UpsConfig {

	private String accountNumber;
	private String clientId;
	private String secret;

	public UpsConfig() {

	}
}
