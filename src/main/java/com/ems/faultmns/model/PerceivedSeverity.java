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
 * Gets or Sets PerceivedSeverity
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public enum PerceivedSeverity {
  
  INDETERMINATE("INDETERMINATE"),
  
  CRITICAL("CRITICAL"),
  
  MAJOR("MAJOR"),
  
  MINOR("MINOR"),
  
  WARNING("WARNING"),
  
  CLEARED("CLEARED");

  private String value;

  PerceivedSeverity(String value) {
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
  public static PerceivedSeverity fromValue(String value) {
    for (PerceivedSeverity b : PerceivedSeverity.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

