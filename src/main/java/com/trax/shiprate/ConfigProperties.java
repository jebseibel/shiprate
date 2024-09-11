package com.trax.shiprate;

import com.trax.shiprate.config.GenericConfig;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigProperties {

    @Bean
    @ConfigurationProperties(prefix = "generic")
    public GenericConfig genericConfig() {
        return new GenericConfig();
    }
}
