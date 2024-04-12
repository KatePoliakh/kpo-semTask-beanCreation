package com.example.beancreation.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
public class BeanCondConfig {
    @Bean
    @Conditional(BeanCond.class)
    public ExampleBeanForCond myBean() {
        return new ExampleBeanForCond();
    }

    @Bean
    @Conditional(BeanCond.class)
    @Scope("prototype")
    public NonSingletonBean myNonSingletonBean() {
        return new NonSingletonBean();
    }
}
