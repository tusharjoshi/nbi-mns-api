package com.ems.faultmns.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * FailedAlarm
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class FailedAlarm {

  private String alarmId;

  private String failureReason;

  public FailedAlarm() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public FailedAlarm(String alarmId, String failureReason) {
    this.alarmId = alarmId;
    this.failureReason = failureReason;
  }

  public FailedAlarm alarmId(String alarmId) {
    this.alarmId = alarmId;
    return this;
  }

  /**
   * Get alarmId
   * @return alarmId
  */
  @NotNull 
  @Schema(name = "alarmId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("alarmId")
  public String getAlarmId() {
    return alarmId;
  }

  public void setAlarmId(String alarmId) {
    this.alarmId = alarmId;
  }

  public FailedAlarm failureReason(String failureReason) {
    this.failureReason = failureReason;
    return this;
  }

  /**
   * Get failureReason
   * @return failureReason
  */
  @NotNull 
  @Schema(name = "failureReason", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("failureReason")
  public String getFailureReason() {
    return failureReason;
  }

  public void setFailureReason(String failureReason) {
    this.failureReason = failureReason;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FailedAlarm failedAlarm = (FailedAlarm) o;
    return Objects.equals(this.alarmId, failedAlarm.alarmId) &&
        Objects.equals(this.failureReason, failedAlarm.failureReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alarmId, failureReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FailedAlarm {\n");
    sb.append("    alarmId: ").append(toIndentedString(alarmId)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

