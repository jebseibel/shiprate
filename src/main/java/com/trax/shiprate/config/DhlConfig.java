package com.trax.shiprate.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Data
@Configuration
@PropertySource("classpath:app_config_dhl.yaml")
public class DhlConfig {

    @Value("${account_number}")
    private String accountNumber;

    @Value("${client_id}")
    private String clientId;

    @Value("${secret}")
    private String secret;

}
