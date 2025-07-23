package com.ems.faultmns.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets AlarmType
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public enum AlarmType {
  
  COMMUNICATIONS_ALARM("COMMUNICATIONS_ALARM"),
  
  QUALITY_OF_SERVICE_ALARM("QUALITY_OF_SERVICE_ALARM"),
  
  PROCESSING_ERROR_ALARM("PROCESSING_ERROR_ALARM"),
  
  EQUIPMENT_ALARM("EQUIPMENT_ALARM"),
  
  ENVIRONMENTAL_ALARM("ENVIRONMENTAL_ALARM"),
  
  INTEGRITY_VIOLATION("INTEGRITY_VIOLATION"),
  
  OPERATIONAL_VIOLATION("OPERATIONAL_VIOLATION"),
  
  PHYSICAL_VIOLATION("PHYSICAL_VIOLATION"),
  
  SECURITY_SERVICE_OR_MECHANISM_VIOLATION("SECURITY_SERVICE_OR_MECHANISM_VIOLATION"),
  
  TIME_DOMAIN_VIOLATION("TIME_DOMAIN_VIOLATION");

  private String value;

  AlarmType(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AlarmType fromValue(String value) {
    for (AlarmType b : AlarmType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

