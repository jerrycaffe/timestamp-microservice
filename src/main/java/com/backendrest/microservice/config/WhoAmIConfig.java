package com.backendrest.microservice.config;

import com.backendrest.microservice.services.WhoAmIService;
import com.backendrest.microservice.services.WhoAmIServiceImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WhoAmIConfig {
    @Bean
    public WhoAmIService whoAmIService(){
        return new WhoAmIServiceImp();
    }
}
