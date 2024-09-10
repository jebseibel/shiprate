package com.shiprate.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Data

public class GenericConfig {
    private String account;
    private String client;
    private String secret;
}
