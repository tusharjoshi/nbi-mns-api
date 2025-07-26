package com.example.ems.nbi.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Example Spring Boot application demonstrating the use of 3GPP NBI MnS API.
 * 
 * This application provides example implementations of:
 * - Fault Management Service (FaultMnS) API
 * - Performance Management Service (PerfMnS) API
 * 
 * The application starts on http://localhost:8080 and provides:
 * - REST API endpoints for fault and performance management
 * - OpenAPI documentation at http://localhost:8080/swagger-ui.html
 * - Actuator endpoints for monitoring
 */
@SpringBootApplication
public class NbiMnsExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(NbiMnsExampleApplication.class, args);
    }

}
