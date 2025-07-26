package com.example.ems.nbi.example.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.Operation;
import io.swagger.v3.oas.models.media.Content;
import io.swagger.v3.oas.models.media.MediaType;
import io.swagger.v3.oas.models.responses.ApiResponse;
import org.springdoc.core.customizers.OpenApiCustomizer;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Map;

@Component
public class ExampleFileLoaderOpenApiCustomiser implements OpenApiCustomizer {

    private final ResourceLoader resourceLoader;
    private final ObjectMapper objectMapper;

    public ExampleFileLoaderOpenApiCustomiser(ResourceLoader resourceLoader, ObjectMapper objectMapper) {
        this.resourceLoader = resourceLoader;
        this.objectMapper = objectMapper;
    }

    @Override
    public void customise(OpenAPI openApi) {
        openApi.getPaths().values().forEach(pathItem ->
            pathItem.readOperationsMap().forEach((httpMethod, operation) ->
                processOperation(operation)
            )
        );
    }

    private void processOperation(Operation operation) {
        if (operation.getResponses() != null) {
            operation.getResponses().values().forEach(apiResponse ->
                processApiResponse(apiResponse)
            );
        }
    }

    private void processApiResponse(ApiResponse apiResponse) {
        if (apiResponse.getContent() != null) {
            apiResponse.getContent().values().forEach(mediaType ->
                processMediaType(mediaType)
            );
        }
    }

    private void processMediaType(MediaType mediaType) {
        if (mediaType.getExamples() != null) {
            for (Map.Entry<String, io.swagger.v3.oas.models.examples.Example> entry : mediaType.getExamples().entrySet()) {
                io.swagger.v3.oas.models.examples.Example example = entry.getValue();
                if (example.getValue() instanceof String && ((String) example.getValue()).startsWith("@")) {
                    String filePath = ((String) example.getValue()).substring(1); // Remove the "@"
                    try {
                        Resource resource = resourceLoader.getResource("classpath:" + filePath);
                        String jsonContent = StreamUtils.copyToString(resource.getInputStream(), StandardCharsets.UTF_8);
                        example.setValue(objectMapper.readTree(jsonContent)); // Parse as JSON Node
                    } catch (IOException e) {
                        // Log the error or handle it appropriately
                        System.err.println("Failed to load example file: " + filePath + " - " + e.getMessage());
                    }
                }
            }
        }
    }
}