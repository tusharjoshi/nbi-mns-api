package com.ems.faultmns.model;

import java.net.URI;
import java.util.Objects;
import com.ems.faultmns.model.AckState;
import com.ems.faultmns.model.AlarmType;
import com.ems.faultmns.model.CorrelatedNotification;
import com.ems.faultmns.model.PerceivedSeverity;
import com.ems.faultmns.model.SpecificProblem;
import com.ems.faultmns.model.ThresholdInfo;
import com.ems.faultmns.model.TrendIndication;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * The alarmId is not a property of an alarm record. It is used as key in the map of alarm records instead.
 */

@Schema(name = "AlarmRecord", description = "The alarmId is not a property of an alarm record. It is used as key in the map of alarm records instead.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AlarmRecord {

  private String objectInstance;

  private Integer notificationId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime alarmRaisedTime;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime alarmChangedTime;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime alarmClearedTime;

  private AlarmType alarmType;

  private Integer probableCause = null;

  private SpecificProblem specificProblem;

  private PerceivedSeverity perceivedSeverity;

  private Boolean backedUpStatus;

  private String backUpObject;

  private TrendIndication trendIndication;

  private ThresholdInfo thresholdinfo;

  @Valid
  private List<@Valid CorrelatedNotification> correlatedNotifications;

  @Valid
  private List<@Valid Map<String, Object>> stateChangeDefinition;

  @Valid
  private Map<String, Object> monitoredAttributes = new HashMap<>();

  private String proposedRepairActions;

  private String additionalText;

  @Valid
  private Map<String, Object> additionalInformation = new HashMap<>();

  private Boolean rootCauseIndicator;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime ackTime;

  private String ackUserId;

  private String ackSystemId;

  private AckState ackState;

  private String clearUserId;

  private String clearSystemId;

  private String serviceUser;

  private String serviceProvider;

  private String securityAlarmDetector;

  public AlarmRecord objectInstance(String objectInstance) {
    this.objectInstance = objectInstance;
    return this;
  }

  /**
   * Get objectInstance
   * @return objectInstance
  */
  
  @Schema(name = "objectInstance", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("objectInstance")
  public String getObjectInstance() {
    return objectInstance;
  }

  public void setObjectInstance(String objectInstance) {
    this.objectInstance = objectInstance;
  }

  public AlarmRecord notificationId(Integer notificationId) {
    this.notificationId = notificationId;
    return this;
  }

  /**
   * Get notificationId
   * @return notificationId
  */
  
  @Schema(name = "notificationId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notificationId")
  public Integer getNotificationId() {
    return notificationId;
  }

  public void setNotificationId(Integer notificationId) {
    this.notificationId = notificationId;
  }

  public AlarmRecord alarmRaisedTime(OffsetDateTime alarmRaisedTime) {
    this.alarmRaisedTime = alarmRaisedTime;
    return this;
  }

  /**
   * Get alarmRaisedTime
   * @return alarmRaisedTime
  */
  @Valid 
  @Schema(name = "alarmRaisedTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("alarmRaisedTime")
  public OffsetDateTime getAlarmRaisedTime() {
    return alarmRaisedTime;
  }

  public void setAlarmRaisedTime(OffsetDateTime alarmRaisedTime) {
    this.alarmRaisedTime = alarmRaisedTime;
  }

  public AlarmRecord alarmChangedTime(OffsetDateTime alarmChangedTime) {
    this.alarmChangedTime = alarmChangedTime;
    return this;
  }

  /**
   * Get alarmChangedTime
   * @return alarmChangedTime
  */
  @Valid 
  @Schema(name = "alarmChangedTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("alarmChangedTime")
  public OffsetDateTime getAlarmChangedTime() {
    return alarmChangedTime;
  }

  public void setAlarmChangedTime(OffsetDateTime alarmChangedTime) {
    this.alarmChangedTime = alarmChangedTime;
  }

  public AlarmRecord alarmClearedTime(OffsetDateTime alarmClearedTime) {
    this.alarmClearedTime = alarmClearedTime;
    return this;
  }

  /**
   * Get alarmClearedTime
   * @return alarmClearedTime
  */
  @Valid 
  @Schema(name = "alarmClearedTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("alarmClearedTime")
  public OffsetDateTime getAlarmClearedTime() {
    return alarmClearedTime;
  }

  public void setAlarmClearedTime(OffsetDateTime alarmClearedTime) {
    this.alarmClearedTime = alarmClearedTime;
  }

  public AlarmRecord alarmType(AlarmType alarmType) {
    this.alarmType = alarmType;
    return this;
  }

  /**
   * Get alarmType
   * @return alarmType
  */
  @Valid 
  @Schema(name = "alarmType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("alarmType")
  public AlarmType getAlarmType() {
    return alarmType;
  }

  public void setAlarmType(AlarmType alarmType) {
    this.alarmType = alarmType;
  }

  public AlarmRecord probableCause(Integer probableCause) {
    this.probableCause = probableCause;
    return this;
  }

  /**
   * Get probableCause
   * @return probableCause
  */
  
  @Schema(name = "probableCause", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("probableCause")
  public Integer getProbableCause() {
    return probableCause;
  }

  public void setProbableCause(Integer probableCause) {
    this.probableCause = probableCause;
  }

  public AlarmRecord specificProblem(SpecificProblem specificProblem) {
    this.specificProblem = specificProblem;
    return this;
  }

  /**
   * Get specificProblem
   * @return specificProblem
  */
  @Valid 
  @Schema(name = "specificProblem", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("specificProblem")
  public SpecificProblem getSpecificProblem() {
    return specificProblem;
  }

  public void setSpecificProblem(SpecificProblem specificProblem) {
    this.specificProblem = specificProblem;
  }

  public AlarmRecord perceivedSeverity(PerceivedSeverity perceivedSeverity) {
    this.perceivedSeverity = perceivedSeverity;
    return this;
  }

  /**
   * Get perceivedSeverity
   * @return perceivedSeverity
  */
  @Valid 
  @Schema(name = "perceivedSeverity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("perceivedSeverity")
  public PerceivedSeverity getPerceivedSeverity() {
    return perceivedSeverity;
  }

  public void setPerceivedSeverity(PerceivedSeverity perceivedSeverity) {
    this.perceivedSeverity = perceivedSeverity;
  }

  public AlarmRecord backedUpStatus(Boolean backedUpStatus) {
    this.backedUpStatus = backedUpStatus;
    return this;
  }

  /**
   * Get backedUpStatus
   * @return backedUpStatus
  */
  
  @Schema(name = "backedUpStatus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("backedUpStatus")
  public Boolean getBackedUpStatus() {
    return backedUpStatus;
  }

  public void setBackedUpStatus(Boolean backedUpStatus) {
    this.backedUpStatus = backedUpStatus;
  }

  public AlarmRecord backUpObject(String backUpObject) {
    this.backUpObject = backUpObject;
    return this;
  }

  /**
   * Get backUpObject
   * @return backUpObject
  */
  
  @Schema(name = "backUpObject", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("backUpObject")
  public String getBackUpObject() {
    return backUpObject;
  }

  public void setBackUpObject(String backUpObject) {
    this.backUpObject = backUpObject;
  }

  public AlarmRecord trendIndication(TrendIndication trendIndication) {
    this.trendIndication = trendIndication;
    return this;
  }

  /**
   * Get trendIndication
   * @return trendIndication
  */
  @Valid 
  @Schema(name = "trendIndication", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trendIndication")
  public TrendIndication getTrendIndication() {
    return trendIndication;
  }

  public void setTrendIndication(TrendIndication trendIndication) {
    this.trendIndication = trendIndication;
  }

  public AlarmRecord thresholdinfo(ThresholdInfo thresholdinfo) {
    this.thresholdinfo = thresholdinfo;
    return this;
  }

  /**
   * Get thresholdinfo
   * @return thresholdinfo
  */
  @Valid 
  @Schema(name = "thresholdinfo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("thresholdinfo")
  public ThresholdInfo getThresholdinfo() {
    return thresholdinfo;
  }

  public void setThresholdinfo(ThresholdInfo thresholdinfo) {
    this.thresholdinfo = thresholdinfo;
  }

  public AlarmRecord correlatedNotifications(List<@Valid CorrelatedNotification> correlatedNotifications) {
    this.correlatedNotifications = correlatedNotifications;
    return this;
  }

  public AlarmRecord addCorrelatedNotificationsItem(CorrelatedNotification correlatedNotificationsItem) {
    if (this.correlatedNotifications == null) {
      this.correlatedNotifications = new ArrayList<>();
    }
    this.correlatedNotifications.add(correlatedNotificationsItem);
    return this;
  }

  /**
   * Get correlatedNotifications
   * @return correlatedNotifications
  */
  @Valid 
  @Schema(name = "correlatedNotifications", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("correlatedNotifications")
  public List<@Valid CorrelatedNotification> getCorrelatedNotifications() {
    return correlatedNotifications;
  }

  public void setCorrelatedNotifications(List<@Valid CorrelatedNotification> correlatedNotifications) {
    this.correlatedNotifications = correlatedNotifications;
  }

  public AlarmRecord stateChangeDefinition(List<@Valid Map<String, Object>> stateChangeDefinition) {
    this.stateChangeDefinition = stateChangeDefinition;
    return this;
  }

  public AlarmRecord addStateChangeDefinitionItem(Map<String, Object> stateChangeDefinitionItem) {
    if (this.stateChangeDefinition == null) {
      this.stateChangeDefinition = new ArrayList<>();
    }
    this.stateChangeDefinition.add(stateChangeDefinitionItem);
    return this;
  }

  /**
   * The first array item contains the attribute name value pairs with the new values, and the second array item the attribute name value pairs with the optional old values.
   * @return stateChangeDefinition
  */
  @Valid @Size(min = 1, max = 2) 
  @Schema(name = "stateChangeDefinition", description = "The first array item contains the attribute name value pairs with the new values, and the second array item the attribute name value pairs with the optional old values.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stateChangeDefinition")
  public List<@Valid Map<String, Object>> getStateChangeDefinition() {
    return stateChangeDefinition;
  }

  public void setStateChangeDefinition(List<@Valid Map<String, Object>> stateChangeDefinition) {
    this.stateChangeDefinition = stateChangeDefinition;
  }

  public AlarmRecord monitoredAttributes(Map<String, Object> monitoredAttributes) {
    this.monitoredAttributes = monitoredAttributes;
    return this;
  }

  public AlarmRecord putMonitoredAttributesItem(String key, Object monitoredAttributesItem) {
    if (this.monitoredAttributes == null) {
      this.monitoredAttributes = new HashMap<>();
    }
    this.monitoredAttributes.put(key, monitoredAttributesItem);
    return this;
  }

  /**
   * The key of this map is the attribute name, and the value the attribute value.
   * @return monitoredAttributes
  */
  @Size(min = 1) 
  @Schema(name = "monitoredAttributes", description = "The key of this map is the attribute name, and the value the attribute value.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("monitoredAttributes")
  public Map<String, Object> getMonitoredAttributes() {
    return monitoredAttributes;
  }

  public void setMonitoredAttributes(Map<String, Object> monitoredAttributes) {
    this.monitoredAttributes = monitoredAttributes;
  }

  public AlarmRecord proposedRepairActions(String proposedRepairActions) {
    this.proposedRepairActions = proposedRepairActions;
    return this;
  }

  /**
   * Get proposedRepairActions
   * @return proposedRepairActions
  */
  
  @Schema(name = "proposedRepairActions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("proposedRepairActions")
  public String getProposedRepairActions() {
    return proposedRepairActions;
  }

  public void setProposedRepairActions(String proposedRepairActions) {
    this.proposedRepairActions = proposedRepairActions;
  }

  public AlarmRecord additionalText(String additionalText) {
    this.additionalText = additionalText;
    return this;
  }

  /**
   * Get additionalText
   * @return additionalText
  */
  
  @Schema(name = "additionalText", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("additionalText")
  public String getAdditionalText() {
    return additionalText;
  }

  public void setAdditionalText(String additionalText) {
    this.additionalText = additionalText;
  }

  public AlarmRecord additionalInformation(Map<String, Object> additionalInformation) {
    this.additionalInformation = additionalInformation;
    return this;
  }

  public AlarmRecord putAdditionalInformationItem(String key, Object additionalInformationItem) {
    if (this.additionalInformation == null) {
      this.additionalInformation = new HashMap<>();
    }
    this.additionalInformation.put(key, additionalInformationItem);
    return this;
  }

  /**
   * The key of this map is the attribute name, and the value the attribute value.
   * @return additionalInformation
  */
  @Size(min = 1) 
  @Schema(name = "additionalInformation", description = "The key of this map is the attribute name, and the value the attribute value.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("additionalInformation")
  public Map<String, Object> getAdditionalInformation() {
    return additionalInformation;
  }

  public void setAdditionalInformation(Map<String, Object> additionalInformation) {
    this.additionalInformation = additionalInformation;
  }

  public AlarmRecord rootCauseIndicator(Boolean rootCauseIndicator) {
    this.rootCauseIndicator = rootCauseIndicator;
    return this;
  }

  /**
   * Get rootCauseIndicator
   * @return rootCauseIndicator
  */
  
  @Schema(name = "rootCauseIndicator", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rootCauseIndicator")
  public Boolean getRootCauseIndicator() {
    return rootCauseIndicator;
  }

  public void setRootCauseIndicator(Boolean rootCauseIndicator) {
    this.rootCauseIndicator = rootCauseIndicator;
  }

  public AlarmRecord ackTime(OffsetDateTime ackTime) {
    this.ackTime = ackTime;
    return this;
  }

  /**
   * Get ackTime
   * @return ackTime
  */
  @Valid 
  @Schema(name = "ackTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ackTime")
  public OffsetDateTime getAckTime() {
    return ackTime;
  }

  public void setAckTime(OffsetDateTime ackTime) {
    this.ackTime = ackTime;
  }

  public AlarmRecord ackUserId(String ackUserId) {
    this.ackUserId = ackUserId;
    return this;
  }

  /**
   * Get ackUserId
   * @return ackUserId
  */
  
  @Schema(name = "ackUserId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ackUserId")
  public String getAckUserId() {
    return ackUserId;
  }

  public void setAckUserId(String ackUserId) {
    this.ackUserId = ackUserId;
  }

  public AlarmRecord ackSystemId(String ackSystemId) {
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

  public AlarmRecord ackState(AckState ackState) {
    this.ackState = ackState;
    return this;
  }

  /**
   * Get ackState
   * @return ackState
  */
  @Valid 
  @Schema(name = "ackState", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ackState")
  public AckState getAckState() {
    return ackState;
  }

  public void setAckState(AckState ackState) {
    this.ackState = ackState;
  }

  public AlarmRecord clearUserId(String clearUserId) {
    this.clearUserId = clearUserId;
    return this;
  }

  /**
   * Get clearUserId
   * @return clearUserId
  */
  
  @Schema(name = "clearUserId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clearUserId")
  public String getClearUserId() {
    return clearUserId;
  }

  public void setClearUserId(String clearUserId) {
    this.clearUserId = clearUserId;
  }

  public AlarmRecord clearSystemId(String clearSystemId) {
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

  public AlarmRecord serviceUser(String serviceUser) {
    this.serviceUser = serviceUser;
    return this;
  }

  /**
   * Get serviceUser
   * @return serviceUser
  */
  
  @Schema(name = "serviceUser", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceUser")
  public String getServiceUser() {
    return serviceUser;
  }

  public void setServiceUser(String serviceUser) {
    this.serviceUser = serviceUser;
  }

  public AlarmRecord serviceProvider(String serviceProvider) {
    this.serviceProvider = serviceProvider;
    return this;
  }

  /**
   * Get serviceProvider
   * @return serviceProvider
  */
  
  @Schema(name = "serviceProvider", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceProvider")
  public String getServiceProvider() {
    return serviceProvider;
  }

  public void setServiceProvider(String serviceProvider) {
    this.serviceProvider = serviceProvider;
  }

  public AlarmRecord securityAlarmDetector(String securityAlarmDetector) {
    this.securityAlarmDetector = securityAlarmDetector;
    return this;
  }

  /**
   * Get securityAlarmDetector
   * @return securityAlarmDetector
  */
  
  @Schema(name = "securityAlarmDetector", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("securityAlarmDetector")
  public String getSecurityAlarmDetector() {
    return securityAlarmDetector;
  }

  public void setSecurityAlarmDetector(String securityAlarmDetector) {
    this.securityAlarmDetector = securityAlarmDetector;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlarmRecord alarmRecord = (AlarmRecord) o;
    return Objects.equals(this.objectInstance, alarmRecord.objectInstance) &&
        Objects.equals(this.notificationId, alarmRecord.notificationId) &&
        Objects.equals(this.alarmRaisedTime, alarmRecord.alarmRaisedTime) &&
        Objects.equals(this.alarmChangedTime, alarmRecord.alarmChangedTime) &&
        Objects.equals(this.alarmClearedTime, alarmRecord.alarmClearedTime) &&
        Objects.equals(this.alarmType, alarmRecord.alarmType) &&
        Objects.equals(this.probableCause, alarmRecord.probableCause) &&
        Objects.equals(this.specificProblem, alarmRecord.specificProblem) &&
        Objects.equals(this.perceivedSeverity, alarmRecord.perceivedSeverity) &&
        Objects.equals(this.backedUpStatus, alarmRecord.backedUpStatus) &&
        Objects.equals(this.backUpObject, alarmRecord.backUpObject) &&
        Objects.equals(this.trendIndication, alarmRecord.trendIndication) &&
        Objects.equals(this.thresholdinfo, alarmRecord.thresholdinfo) &&
        Objects.equals(this.correlatedNotifications, alarmRecord.correlatedNotifications) &&
        Objects.equals(this.stateChangeDefinition, alarmRecord.stateChangeDefinition) &&
        Objects.equals(this.monitoredAttributes, alarmRecord.monitoredAttributes) &&
        Objects.equals(this.proposedRepairActions, alarmRecord.proposedRepairActions) &&
        Objects.equals(this.additionalText, alarmRecord.additionalText) &&
        Objects.equals(this.additionalInformation, alarmRecord.additionalInformation) &&
        Objects.equals(this.rootCauseIndicator, alarmRecord.rootCauseIndicator) &&
        Objects.equals(this.ackTime, alarmRecord.ackTime) &&
        Objects.equals(this.ackUserId, alarmRecord.ackUserId) &&
        Objects.equals(this.ackSystemId, alarmRecord.ackSystemId) &&
        Objects.equals(this.ackState, alarmRecord.ackState) &&
        Objects.equals(this.clearUserId, alarmRecord.clearUserId) &&
        Objects.equals(this.clearSystemId, alarmRecord.clearSystemId) &&
        Objects.equals(this.serviceUser, alarmRecord.serviceUser) &&
        Objects.equals(this.serviceProvider, alarmRecord.serviceProvider) &&
        Objects.equals(this.securityAlarmDetector, alarmRecord.securityAlarmDetector);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectInstance, notificationId, alarmRaisedTime, alarmChangedTime, alarmClearedTime, alarmType, probableCause, specificProblem, perceivedSeverity, backedUpStatus, backUpObject, trendIndication, thresholdinfo, correlatedNotifications, stateChangeDefinition, monitoredAttributes, proposedRepairActions, additionalText, additionalInformation, rootCauseIndicator, ackTime, ackUserId, ackSystemId, ackState, clearUserId, clearSystemId, serviceUser, serviceProvider, securityAlarmDetector);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlarmRecord {\n");
    sb.append("    objectInstance: ").append(toIndentedString(objectInstance)).append("\n");
    sb.append("    notificationId: ").append(toIndentedString(notificationId)).append("\n");
    sb.append("    alarmRaisedTime: ").append(toIndentedString(alarmRaisedTime)).append("\n");
    sb.append("    alarmChangedTime: ").append(toIndentedString(alarmChangedTime)).append("\n");
    sb.append("    alarmClearedTime: ").append(toIndentedString(alarmClearedTime)).append("\n");
    sb.append("    alarmType: ").append(toIndentedString(alarmType)).append("\n");
    sb.append("    probableCause: ").append(toIndentedString(probableCause)).append("\n");
    sb.append("    specificProblem: ").append(toIndentedString(specificProblem)).append("\n");
    sb.append("    perceivedSeverity: ").append(toIndentedString(perceivedSeverity)).append("\n");
    sb.append("    backedUpStatus: ").append(toIndentedString(backedUpStatus)).append("\n");
    sb.append("    backUpObject: ").append(toIndentedString(backUpObject)).append("\n");
    sb.append("    trendIndication: ").append(toIndentedString(trendIndication)).append("\n");
    sb.append("    thresholdinfo: ").append(toIndentedString(thresholdinfo)).append("\n");
    sb.append("    correlatedNotifications: ").append(toIndentedString(correlatedNotifications)).append("\n");
    sb.append("    stateChangeDefinition: ").append(toIndentedString(stateChangeDefinition)).append("\n");
    sb.append("    monitoredAttributes: ").append(toIndentedString(monitoredAttributes)).append("\n");
    sb.append("    proposedRepairActions: ").append(toIndentedString(proposedRepairActions)).append("\n");
    sb.append("    additionalText: ").append(toIndentedString(additionalText)).append("\n");
    sb.append("    additionalInformation: ").append(toIndentedString(additionalInformation)).append("\n");
    sb.append("    rootCauseIndicator: ").append(toIndentedString(rootCauseIndicator)).append("\n");
    sb.append("    ackTime: ").append(toIndentedString(ackTime)).append("\n");
    sb.append("    ackUserId: ").append(toIndentedString(ackUserId)).append("\n");
    sb.append("    ackSystemId: ").append(toIndentedString(ackSystemId)).append("\n");
    sb.append("    ackState: ").append(toIndentedString(ackState)).append("\n");
    sb.append("    clearUserId: ").append(toIndentedString(clearUserId)).append("\n");
    sb.append("    clearSystemId: ").append(toIndentedString(clearSystemId)).append("\n");
    sb.append("    serviceUser: ").append(toIndentedString(serviceUser)).append("\n");
    sb.append("    serviceProvider: ").append(toIndentedString(serviceProvider)).append("\n");
    sb.append("    securityAlarmDetector: ").append(toIndentedString(securityAlarmDetector)).append("\n");
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

