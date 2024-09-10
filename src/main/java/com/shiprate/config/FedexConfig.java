package com.shiprate.config;

import lombok.Data;

@Data
public class FedexConfig {

	private String accountNumber;
	private String clientId;
	private String secret;

	public FedexConfig() {

	}
}
