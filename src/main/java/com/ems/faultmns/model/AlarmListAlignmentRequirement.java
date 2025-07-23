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
 * Gets or Sets AlarmListAlignmentRequirement
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public enum AlarmListAlignmentRequirement {
  
  REQUIRED("ALIGNMENT_REQUIRED"),
  
  NOT_REQUIRED("ALIGNMENT_NOT_REQUIRED");

  private String value;

  AlarmListAlignmentRequirement(String value) {
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
  public static AlarmListAlignmentRequirement fromValue(String value) {
    for (AlarmListAlignmentRequirement b : AlarmListAlignmentRequirement.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

