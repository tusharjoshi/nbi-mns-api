package com.example.ems.nbi.example.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Configuration class for the NBI MnS Example application.
 * 
 * This class provides:
 * - OpenAPI/Swagger documentation configuration
 * - CORS configuration for cross-origin requests
 * - Additional Spring MVC configuration
 */
@Configuration
public class ExampleApplicationConfig {

    /**
     * Custom OpenAPI configuration for the example application.
     * This provides enhanced documentation for the API.
     */
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("3GPP NBI MnS API Example")
                        .description("Example implementation of 3GPP Management Services (MnS) APIs\n\n" +
                                "This application demonstrates the implementation of:\n" +
                                "- **Fault Management Service (FaultMnS)** - TS28532_FaultMnS\n" +
                                "- **Performance Management Service (PerfMnS)** - TS28532_PerfMnS\n\n" +
                                "The APIs are automatically generated from official 3GPP OpenAPI specifications " +
                                "and provide Spring Boot compatible interfaces for telecommunication network management.")
                        .version("1.0.0")
                        .contact(new Contact()
                                .name("Example Implementation")
                                // .email("support@example.com")
                                // .url("https://example.com")
                                )
                        .license(new License()
                                .name("Apache License 2.0")
                                .url("https://www.apache.org/licenses/LICENSE-2.0")));
    }

    /**
     * CORS configuration to allow cross-origin requests.
     * This is commonly needed in telecom environments where
     * management interfaces may be accessed from different domains.
     */
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                // Allow CORS for all fault management endpoints
                registry.addMapping("/alarms/**")
                        .allowedOrigins("*")
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "PATCH")
                        .allowedHeaders("*")
                        .maxAge(3600);
                        
                // Allow CORS for subscription endpoints
                registry.addMapping("/subscriptions/**")
                        .allowedOrigins("*")
                        .allowedMethods("GET", "POST", "PUT", "DELETE")
                        .allowedHeaders("*")
                        .maxAge(3600);
                        
                // Allow CORS for notification endpoints
                registry.addMapping("/notify*/**")
                        .allowedOrigins("*")
                        .allowedMethods("POST")
                        .allowedHeaders("*")
                        .maxAge(3600);

                // Allow CORS for performance management endpoints
                registry.addMapping("/notificationSink/**")
                        .allowedOrigins("*")
                        .allowedMethods("POST")
                        .allowedHeaders("*")
                        .maxAge(3600);

                // Allow CORS for API documentation
                registry.addMapping("/api-docs/**")
                        .allowedOrigins("*")
                        .allowedMethods("GET")
                        .allowedHeaders("*")
                        .maxAge(3600);

                registry.addMapping("/swagger-ui/**")
                        .allowedOrigins("*")
                        .allowedMethods("GET")
                        .allowedHeaders("*")
                        .maxAge(3600);
            }
        };
    }
}
