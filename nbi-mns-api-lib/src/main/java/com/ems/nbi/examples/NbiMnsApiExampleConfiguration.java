package com.ems.nbi.examples;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.lang.NonNull;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Example configuration for integrating 3GPP NBI MnS API.
 * 
 * This class demonstrates how to configure the library in your Spring Boot application.
 * It's included as an example and is not automatically loaded - you can copy and adapt
 * these configurations to your own application.
 */
@Configuration
public class NbiMnsApiExampleConfiguration {

    /**
     * Example CORS configuration for 3GPP MnS APIs.
     * Allows cross-origin requests which are common in telecom environments.
     */
    @Bean
    @ConditionalOnMissingBean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(@NonNull CorsRegistry registry) {
                registry.addMapping("/alarms/**")
                        .allowedOrigins("*")
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "PATCH")
                        .allowedHeaders("*");
                        
                registry.addMapping("/subscriptions/**")
                        .allowedOrigins("*")
                        .allowedMethods("GET", "POST", "PUT", "DELETE")
                        .allowedHeaders("*");
                        
                registry.addMapping("/notificationSink/**")
                        .allowedOrigins("*")
                        .allowedMethods("POST")
                        .allowedHeaders("*");
            }
        };
    }
}
