package com.ems.faultmns.model;

import java.net.URI;
import java.util.Objects;
import com.ems.faultmns.model.AckState;
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
 * Patch document acknowledging or unacknowledging a single alarm. For acknowledging an alarm the value of ackState is ACKNOWLEDGED, for unacknowledging an alarm the value of ackState is UNACKNOWLEDGED.
 */

@Schema(name = "MergePatchAcknowledgeAlarm", description = "Patch document acknowledging or unacknowledging a single alarm. For acknowledging an alarm the value of ackState is ACKNOWLEDGED, for unacknowledging an alarm the value of ackState is UNACKNOWLEDGED.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class MergePatchAcknowledgeAlarm implements AlarmsAlarmIdPatchRequest {

  private String ackUserId;

  private String ackSystemId;

  private AckState ackState;

  public MergePatchAcknowledgeAlarm() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MergePatchAcknowledgeAlarm(String ackUserId, AckState ackState) {
    this.ackUserId = ackUserId;
    this.ackState = ackState;
  }

  public MergePatchAcknowledgeAlarm ackUserId(String ackUserId) {
    this.ackUserId = ackUserId;
    return this;
  }

  /**
   * Get ackUserId
   * @return ackUserId
  */
  @NotNull 
  @Schema(name = "ackUserId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ackUserId")
  public String getAckUserId() {
    return ackUserId;
  }

  public void setAckUserId(String ackUserId) {
    this.ackUserId = ackUserId;
  }

  public MergePatchAcknowledgeAlarm ackSystemId(String ackSystemId) {
    this.ackSystemId = ackSystemId;
    return this;
  }

  /**
   * Get ackSystemId
   * @return ackSystemId
  */
  
  @Schema(name = "ackSystemId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ackSystemId")
  public String getAckSystemId() {
    return ackSystemId;
  }

  public void setAckSystemId(String ackSystemId) {
    this.ackSystemId = ackSystemId;
  }

  public MergePatchAcknowledgeAlarm ackState(AckState ackState) {
    this.ackState = ackState;
    return this;
  }

  /**
   * Get ackState
   * @return ackState
  */
  @NotNull @Valid 
  @Schema(name = "ackState", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ackState")
  public AckState getAckState() {
    return ackState;
  }

  public void setAckState(AckState ackState) {
    this.ackState = ackState;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MergePatchAcknowledgeAlarm mergePatchAcknowledgeAlarm = (MergePatchAcknowledgeAlarm) o;
    return Objects.equals(this.ackUserId, mergePatchAcknowledgeAlarm.ackUserId) &&
        Objects.equals(this.ackSystemId, mergePatchAcknowledgeAlarm.ackSystemId) &&
        Objects.equals(this.ackState, mergePatchAcknowledgeAlarm.ackState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ackUserId, ackSystemId, ackState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MergePatchAcknowledgeAlarm {\n");
    sb.append("    ackUserId: ").append(toIndentedString(ackUserId)).append("\n");
    sb.append("    ackSystemId: ").append(toIndentedString(ackSystemId)).append("\n");
    sb.append("    ackState: ").append(toIndentedString(ackState)).append("\n");
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

