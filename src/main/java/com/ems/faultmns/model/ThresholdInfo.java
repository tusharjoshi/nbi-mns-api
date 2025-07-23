package com.ems.faultmns.model;

import java.net.URI;
import java.util.Objects;
import com.ems.faultmns.model.ThresholdLevelInd;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ThresholdInfo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ThresholdInfo {

  private String observedMeasurement;

  private BigDecimal observedValue;

  private ThresholdLevelInd thresholdLevel;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime armTime;

  public ThresholdInfo() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ThresholdInfo(String observedMeasurement, BigDecimal observedValue) {
    this.observedMeasurement = observedMeasurement;
    this.observedValue = observedValue;
  }

  public ThresholdInfo observedMeasurement(String observedMeasurement) {
    this.observedMeasurement = observedMeasurement;
    return this;
  }

  /**
   * Get observedMeasurement
   * @return observedMeasurement
  */
  @NotNull 
  @Schema(name = "observedMeasurement", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("observedMeasurement")
  public String getObservedMeasurement() {
    return observedMeasurement;
  }

  public void setObservedMeasurement(String observedMeasurement) {
    this.observedMeasurement = observedMeasurement;
  }

  public ThresholdInfo observedValue(BigDecimal observedValue) {
    this.observedValue = observedValue;
    return this;
  }

  /**
   * Get observedValue
   * @return observedValue
  */
  @NotNull @Valid 
  @Schema(name = "observedValue", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("observedValue")
  public BigDecimal getObservedValue() {
    return observedValue;
  }

  public void setObservedValue(BigDecimal observedValue) {
    this.observedValue = observedValue;
  }

  public ThresholdInfo thresholdLevel(ThresholdLevelInd thresholdLevel) {
    this.thresholdLevel = thresholdLevel;
    return this;
  }

  /**
   * Get thresholdLevel
   * @return thresholdLevel
  */
  @Valid 
  @Schema(name = "thresholdLevel", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("thresholdLevel")
  public ThresholdLevelInd getThresholdLevel() {
    return thresholdLevel;
  }

  public void setThresholdLevel(ThresholdLevelInd thresholdLevel) {
    this.thresholdLevel = thresholdLevel;
  }

  public ThresholdInfo armTime(OffsetDateTime armTime) {
    this.armTime = armTime;
    return this;
  }

  /**
   * Get armTime
   * @return armTime
  */
  @Valid 
  @Schema(name = "armTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("armTime")
  public OffsetDateTime getArmTime() {
    return armTime;
  }

  public void setArmTime(OffsetDateTime armTime) {
    this.armTime = armTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThresholdInfo thresholdInfo = (ThresholdInfo) o;
    return Objects.equals(this.observedMeasurement, thresholdInfo.observedMeasurement) &&
        Objects.equals(this.observedValue, thresholdInfo.observedValue) &&
        Objects.equals(this.thresholdLevel, thresholdInfo.thresholdLevel) &&
        Objects.equals(this.armTime, thresholdInfo.armTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(observedMeasurement, observedValue, thresholdLevel, armTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThresholdInfo {\n");
    sb.append("    observedMeasurement: ").append(toIndentedString(observedMeasurement)).append("\n");
    sb.append("    observedValue: ").append(toIndentedString(observedValue)).append("\n");
    sb.append("    thresholdLevel: ").append(toIndentedString(thresholdLevel)).append("\n");
    sb.append("    armTime: ").append(toIndentedString(armTime)).append("\n");
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

