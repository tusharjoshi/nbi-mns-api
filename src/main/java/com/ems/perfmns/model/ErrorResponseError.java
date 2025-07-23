package com.ems.perfmns.model;

import java.net.URI;
import java.util.Objects;
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
 * ErrorResponseError
 */

@JsonTypeName("ErrorResponse_error")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ErrorResponseError {

  private String errorInfo;

  public ErrorResponseError errorInfo(String errorInfo) {
    this.errorInfo = errorInfo;
    return this;
  }

  /**
   * Get errorInfo
   * @return errorInfo
  */
  
  @Schema(name = "errorInfo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errorInfo")
  public String getErrorInfo() {
    return errorInfo;
  }

  public void setErrorInfo(String errorInfo) {
    this.errorInfo = errorInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorResponseError errorResponseError = (ErrorResponseError) o;
    return Objects.equals(this.errorInfo, errorResponseError.errorInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorResponseError {\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
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

