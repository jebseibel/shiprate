package com.shiprate;

import com.shiprate.config.UpsConfig;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigProperties {

    @Bean
    @ConfigurationProperties(prefix = "ups")
    public UpsConfig upsConfigApp() {
        return new UpsConfig();
    }
}
