package com.ems.faultmns.model;

import java.net.URI;
import java.util.Objects;
import com.ems.faultmns.model.ThresholdHysteresis;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ThresholdLevelIndOneOf
 */

@JsonTypeName("ThresholdLevelInd_oneOf")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ThresholdLevelIndOneOf implements ThresholdLevelInd {

  private ThresholdHysteresis up;

  public ThresholdLevelIndOneOf up(ThresholdHysteresis up) {
    this.up = up;
    return this;
  }

  /**
   * Get up
   * @return up
  */
  @Valid 
  @Schema(name = "up", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("up")
  public ThresholdHysteresis getUp() {
    return up;
  }

  public void setUp(ThresholdHysteresis up) {
    this.up = up;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThresholdLevelIndOneOf thresholdLevelIndOneOf = (ThresholdLevelIndOneOf) o;
    return Objects.equals(this.up, thresholdLevelIndOneOf.up);
  }

  @Override
  public int hashCode() {
    return Objects.hash(up);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThresholdLevelIndOneOf {\n");
    sb.append("    up: ").append(toIndentedString(up)).append("\n");
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

