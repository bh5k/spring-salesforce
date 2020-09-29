package com.pluralsight.spring.salesforce;

import com.pluralsight.spring.salesforce.model.part.Engine;
import com.pluralsight.spring.salesforce.model.part.Transmission;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SalesforceUpskillConfig {

    @Bean
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    public Engine getEngine() {
        return new Engine();
    }

    @Bean
    public Transmission getTransmission() {
        return new Transmission();
    }

}
