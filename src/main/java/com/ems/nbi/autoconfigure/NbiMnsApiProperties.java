package com.ems.nbi.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Configuration properties for 3GPP NBI MnS API.
 * 
 * Allows customization of the API behavior through application properties.
 */
@ConfigurationProperties(prefix = "nbi.mns")
public class NbiMnsApiProperties {

    /**
     * Enable or disable Fault Management Service API.
     */
    private boolean faultMnsEnabled = true;

    /**
     * Enable or disable Performance Management Service API.
     */
    private boolean perfMnsEnabled = true;

    /**
     * Base path for API endpoints (if using a custom context path).
     */
    private String basePath = "";

    /**
     * Enable API documentation generation.
     */
    private boolean apiDocumentationEnabled = true;

    public boolean isFaultMnsEnabled() {
        return faultMnsEnabled;
    }

    public void setFaultMnsEnabled(boolean faultMnsEnabled) {
        this.faultMnsEnabled = faultMnsEnabled;
    }

    public boolean isPerfMnsEnabled() {
        return perfMnsEnabled;
    }

    public void setPerfMnsEnabled(boolean perfMnsEnabled) {
        this.perfMnsEnabled = perfMnsEnabled;
    }

    public String getBasePath() {
        return basePath;
    }

    public void setBasePath(String basePath) {
        this.basePath = basePath;
    }

    public boolean isApiDocumentationEnabled() {
        return apiDocumentationEnabled;
    }

    public void setApiDocumentationEnabled(boolean apiDocumentationEnabled) {
        this.apiDocumentationEnabled = apiDocumentationEnabled;
    }
}
