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
 * ThresholdLevelIndOneOf1
 */

@JsonTypeName("ThresholdLevelInd_oneOf_1")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ThresholdLevelIndOneOf1 implements ThresholdLevelInd {

  private ThresholdHysteresis down;

  public ThresholdLevelIndOneOf1 down(ThresholdHysteresis down) {
    this.down = down;
    return this;
  }

  /**
   * Get down
   * @return down
  */
  @Valid 
  @Schema(name = "down", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("down")
  public ThresholdHysteresis getDown() {
    return down;
  }

  public void setDown(ThresholdHysteresis down) {
    this.down = down;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThresholdLevelIndOneOf1 thresholdLevelIndOneOf1 = (ThresholdLevelIndOneOf1) o;
    return Objects.equals(this.down, thresholdLevelIndOneOf1.down);
  }

  @Override
  public int hashCode() {
    return Objects.hash(down);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThresholdLevelIndOneOf1 {\n");
    sb.append("    down: ").append(toIndentedString(down)).append("\n");
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

