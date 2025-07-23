package com.ems.faultmns.model;

import java.net.URI;
import java.util.Objects;
import com.ems.faultmns.model.ThresholdHysteresisHigh;
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
 * ThresholdHysteresis
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ThresholdHysteresis {

  private ThresholdHysteresisHigh high;

  private Float low;

  public ThresholdHysteresis() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ThresholdHysteresis(ThresholdHysteresisHigh high) {
    this.high = high;
  }

  public ThresholdHysteresis high(ThresholdHysteresisHigh high) {
    this.high = high;
    return this;
  }

  /**
   * Get high
   * @return high
  */
  @NotNull @Valid 
  @Schema(name = "high", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("high")
  public ThresholdHysteresisHigh getHigh() {
    return high;
  }

  public void setHigh(ThresholdHysteresisHigh high) {
    this.high = high;
  }

  public ThresholdHysteresis low(Float low) {
    this.low = low;
    return this;
  }

  /**
   * Get low
   * @return low
  */
  
  @Schema(name = "low", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("low")
  public Float getLow() {
    return low;
  }

  public void setLow(Float low) {
    this.low = low;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThresholdHysteresis thresholdHysteresis = (ThresholdHysteresis) o;
    return Objects.equals(this.high, thresholdHysteresis.high) &&
        Objects.equals(this.low, thresholdHysteresis.low);
  }

  @Override
  public int hashCode() {
    return Objects.hash(high, low);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThresholdHysteresis {\n");
    sb.append("    high: ").append(toIndentedString(high)).append("\n");
    sb.append("    low: ").append(toIndentedString(low)).append("\n");
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

