package com.ems.faultmns.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Patch document for clearing a single alarm
 */

@Schema(name = "MergePatchClearAlarm", description = "Patch document for clearing a single alarm")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class MergePatchClearAlarm implements AlarmsAlarmIdPatchRequest {

  private String clearUserId;

  private String clearSystemId;

  /**
   * Gets or Sets perceivedSeverity
   */
  public enum PerceivedSeverityEnum {
    CLEARED("CLEARED");

    private String value;

    PerceivedSeverityEnum(String value) {
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
    public static PerceivedSeverityEnum fromValue(String value) {
      for (PerceivedSeverityEnum b : PerceivedSeverityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private PerceivedSeverityEnum perceivedSeverity;

  public MergePatchClearAlarm() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MergePatchClearAlarm(String clearUserId, PerceivedSeverityEnum perceivedSeverity) {
    this.clearUserId = clearUserId;
    this.perceivedSeverity = perceivedSeverity;
  }

  public MergePatchClearAlarm clearUserId(String clearUserId) {
    this.clearUserId = clearUserId;
    return this;
  }

  /**
   * Get clearUserId
   * @return clearUserId
  */
  @NotNull 
  @Schema(name = "clearUserId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("clearUserId")
  public String getClearUserId() {
    return clearUserId;
  }

  public void setClearUserId(String clearUserId) {
    this.clearUserId = clearUserId;
  }

  public MergePatchClearAlarm clearSystemId(String clearSystemId) {
    this.clearSystemId = clearSystemId;
    return this;
  }

  /**
   * Get clearSystemId
   * @return clearSystemId
  */
  
  @Schema(name = "clearSystemId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clearSystemId")
  public String getClearSystemId() {
    return clearSystemId;
  }

  public void setClearSystemId(String clearSystemId) {
    this.clearSystemId = clearSystemId;
  }

  public MergePatchClearAlarm perceivedSeverity(PerceivedSeverityEnum perceivedSeverity) {
    this.perceivedSeverity = perceivedSeverity;
    return this;
  }

  /**
   * Get perceivedSeverity
   * @return perceivedSeverity
  */
  @NotNull 
  @Schema(name = "perceivedSeverity", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("perceivedSeverity")
  public PerceivedSeverityEnum getPerceivedSeverity() {
    return perceivedSeverity;
  }

  public void setPerceivedSeverity(PerceivedSeverityEnum perceivedSeverity) {
    this.perceivedSeverity = perceivedSeverity;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MergePatchClearAlarm mergePatchClearAlarm = (MergePatchClearAlarm) o;
    return Objects.equals(this.clearUserId, mergePatchClearAlarm.clearUserId) &&
        Objects.equals(this.clearSystemId, mergePatchClearAlarm.clearSystemId) &&
        Objects.equals(this.perceivedSeverity, mergePatchClearAlarm.perceivedSeverity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clearUserId, clearSystemId, perceivedSeverity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MergePatchClearAlarm {\n");
    sb.append("    clearUserId: ").append(toIndentedString(clearUserId)).append("\n");
    sb.append("    clearSystemId: ").append(toIndentedString(clearSystemId)).append("\n");
    sb.append("    perceivedSeverity: ").append(toIndentedString(perceivedSeverity)).append("\n");
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

