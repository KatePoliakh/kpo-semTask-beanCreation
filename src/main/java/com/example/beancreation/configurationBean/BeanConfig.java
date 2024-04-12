package com.example.beancreation.configurationBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean
    public ExampleBean exampleBean() {
        return new ExampleBean();
    }
}
