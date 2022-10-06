package com.zaurtregulov.spring.rest.configurator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@ComponentScan(basePackages = "com.zaurtregulov.spring.rest")
public class MyConfig {
    @Bean
    public RestTemplate restTemplate () {
        return new RestTemplate();
    }
}