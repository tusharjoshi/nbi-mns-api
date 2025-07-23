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
 * Gets or Sets AlarmAckState
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public enum AlarmAckState {
  
  ALARMS("ALL_ALARMS"),
  
  ACTIVE_ALARMS("ALL_ACTIVE_ALARMS"),
  
  ACTIVE_AND_ACKNOWLEDGED_ALARMS("ALL_ACTIVE_AND_ACKNOWLEDGED_ALARMS"),
  
  ACTIVE_AND_UNACKNOWLEDGED_ALARMS("ALL_ACTIVE_AND_UNACKNOWLEDGED_ALARMS"),
  
  CLEARED_AND_UNACKNOWLEDGED_ALARMS("ALL_CLEARED_AND_UNACKNOWLEDGED_ALARMS"),
  
  UNACKNOWLEDGED_ALARMS("ALL_UNACKNOWLEDGED_ALARMS");

  private String value;

  AlarmAckState(String value) {
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
  public static AlarmAckState fromValue(String value) {
    for (AlarmAckState b : AlarmAckState.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

