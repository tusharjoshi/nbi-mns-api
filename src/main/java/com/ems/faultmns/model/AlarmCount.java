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
 * AlarmCount
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AlarmCount {

  private Integer criticalCount;

  private Integer majorCount;

  private Integer minorCount;

  private Integer warningCount;

  private Integer indeterminateCount;

  private Integer clearedCount;

  public AlarmCount() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AlarmCount(Integer criticalCount, Integer majorCount, Integer minorCount, Integer warningCount, Integer indeterminateCount, Integer clearedCount) {
    this.criticalCount = criticalCount;
    this.majorCount = majorCount;
    this.minorCount = minorCount;
    this.warningCount = warningCount;
    this.indeterminateCount = indeterminateCount;
    this.clearedCount = clearedCount;
  }

  public AlarmCount criticalCount(Integer criticalCount) {
    this.criticalCount = criticalCount;
    return this;
  }

  /**
   * Get criticalCount
   * @return criticalCount
  */
  @NotNull 
  @Schema(name = "criticalCount", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("criticalCount")
  public Integer getCriticalCount() {
    return criticalCount;
  }

  public void setCriticalCount(Integer criticalCount) {
    this.criticalCount = criticalCount;
  }

  public AlarmCount majorCount(Integer majorCount) {
    this.majorCount = majorCount;
    return this;
  }

  /**
   * Get majorCount
   * @return majorCount
  */
  @NotNull 
  @Schema(name = "majorCount", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("majorCount")
  public Integer getMajorCount() {
    return majorCount;
  }

  public void setMajorCount(Integer majorCount) {
    this.majorCount = majorCount;
  }

  public AlarmCount minorCount(Integer minorCount) {
    this.minorCount = minorCount;
    return this;
  }

  /**
   * Get minorCount
   * @return minorCount
  */
  @NotNull 
  @Schema(name = "minorCount", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("minorCount")
  public Integer getMinorCount() {
    return minorCount;
  }

  public void setMinorCount(Integer minorCount) {
    this.minorCount = minorCount;
  }

  public AlarmCount warningCount(Integer warningCount) {
    this.warningCount = warningCount;
    return this;
  }

  /**
   * Get warningCount
   * @return warningCount
  */
  @NotNull 
  @Schema(name = "warningCount", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("warningCount")
  public Integer getWarningCount() {
    return warningCount;
  }

  public void setWarningCount(Integer warningCount) {
    this.warningCount = warningCount;
  }

  public AlarmCount indeterminateCount(Integer indeterminateCount) {
    this.indeterminateCount = indeterminateCount;
    return this;
  }

  /**
   * Get indeterminateCount
   * @return indeterminateCount
  */
  @NotNull 
  @Schema(name = "indeterminateCount", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("indeterminateCount")
  public Integer getIndeterminateCount() {
    return indeterminateCount;
  }

  public void setIndeterminateCount(Integer indeterminateCount) {
    this.indeterminateCount = indeterminateCount;
  }

  public AlarmCount clearedCount(Integer clearedCount) {
    this.clearedCount = clearedCount;
    return this;
  }

  /**
   * Get clearedCount
   * @return clearedCount
  */
  @NotNull 
  @Schema(name = "clearedCount", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("clearedCount")
  public Integer getClearedCount() {
    return clearedCount;
  }

  public void setClearedCount(Integer clearedCount) {
    this.clearedCount = clearedCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlarmCount alarmCount = (AlarmCount) o;
    return Objects.equals(this.criticalCount, alarmCount.criticalCount) &&
        Objects.equals(this.majorCount, alarmCount.majorCount) &&
        Objects.equals(this.minorCount, alarmCount.minorCount) &&
        Objects.equals(this.warningCount, alarmCount.warningCount) &&
        Objects.equals(this.indeterminateCount, alarmCount.indeterminateCount) &&
        Objects.equals(this.clearedCount, alarmCount.clearedCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(criticalCount, majorCount, minorCount, warningCount, indeterminateCount, clearedCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlarmCount {\n");
    sb.append("    criticalCount: ").append(toIndentedString(criticalCount)).append("\n");
    sb.append("    majorCount: ").append(toIndentedString(majorCount)).append("\n");
    sb.append("    minorCount: ").append(toIndentedString(minorCount)).append("\n");
    sb.append("    warningCount: ").append(toIndentedString(warningCount)).append("\n");
    sb.append("    indeterminateCount: ").append(toIndentedString(indeterminateCount)).append("\n");
    sb.append("    clearedCount: ").append(toIndentedString(clearedCount)).append("\n");
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

