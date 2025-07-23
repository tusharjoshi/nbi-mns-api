package com.ems.nbi.autoconfigure;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Auto-configuration for 3GPP NBI MnS API components.
 * 
 * This configuration automatically scans and registers:
 * - Fault Management Service (FaultMnS) API interfaces
 * - Performance Management Service (PerfMnS) API interfaces
 * - Associated model classes and utilities
 * 
 * The configuration is activated when:
 * - Spring Boot is present on the classpath
 * - Web application context is detected
 * - Spring MVC is available
 */
@AutoConfiguration
@ConditionalOnWebApplication(type = ConditionalOnWebApplication.Type.SERVLET)
@ConditionalOnClass(WebMvcConfigurer.class)
@EnableConfigurationProperties(NbiMnsApiProperties.class)
public class NbiMnsApiAutoConfiguration {

    /**
     * Configuration for Fault Management Service API components.
     */
    @Configuration
    @ConditionalOnClass(name = "com.ems.faultmns.api.FaultApi")
    @ConditionalOnProperty(prefix = "nbi.mns", name = "fault-mns-enabled", havingValue = "true", matchIfMissing = true)
    @ComponentScan(basePackages = "com.ems.faultmns")
    public static class FaultMnsConfiguration {
    }

    /**
     * Configuration for Performance Management Service API components.
     */
    @Configuration
    @ConditionalOnClass(name = "com.ems.perfmns.api.PerfApi")
    @ConditionalOnProperty(prefix = "nbi.mns", name = "perf-mns-enabled", havingValue = "true", matchIfMissing = true)
    @ComponentScan(basePackages = "com.ems.perfmns")
    public static class PerfMnsConfiguration {
    }
}
