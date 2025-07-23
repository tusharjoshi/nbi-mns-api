package com.ems.faultmns.model;

import java.net.URI;
import java.util.Objects;
import com.ems.faultmns.model.AckState;
import com.ems.faultmns.model.AlarmType;
import com.ems.faultmns.model.Comment;
import com.ems.faultmns.model.CorrelatedNotification;
import com.ems.faultmns.model.NotificationHeader;
import com.ems.faultmns.model.PerceivedSeverity;
import com.ems.faultmns.model.SpecificProblem;
import com.ems.faultmns.model.ThresholdInfo;
import com.ems.faultmns.model.TrendIndication;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * AlarmsGet200ResponseValue
 */

@JsonTypeName("_alarms_get_200_response_value")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AlarmsGet200ResponseValue {

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

  private NotificationHeader lastNotificationHeader;

  @Valid
  private Map<String, Comment> comments = new HashMap<>();

  public AlarmsGet200ResponseValue objectInstance(String objectInstance) {
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

  public AlarmsGet200ResponseValue notificationId(Integer notificationId) {
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

  public AlarmsGet200ResponseValue alarmRaisedTime(OffsetDateTime alarmRaisedTime) {
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

  public AlarmsGet200ResponseValue alarmChangedTime(OffsetDateTime alarmChangedTime) {
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

  public AlarmsGet200ResponseValue alarmClearedTime(OffsetDateTime alarmClearedTime) {
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

  public AlarmsGet200ResponseValue alarmType(AlarmType alarmType) {
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

  public AlarmsGet200ResponseValue probableCause(Integer probableCause) {
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

  public AlarmsGet200ResponseValue specificProblem(SpecificProblem specificProblem) {
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

  public AlarmsGet200ResponseValue perceivedSeverity(PerceivedSeverity perceivedSeverity) {
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

  public AlarmsGet200ResponseValue backedUpStatus(Boolean backedUpStatus) {
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

  public AlarmsGet200ResponseValue backUpObject(String backUpObject) {
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

  public AlarmsGet200ResponseValue trendIndication(TrendIndication trendIndication) {
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

  public AlarmsGet200ResponseValue thresholdinfo(ThresholdInfo thresholdinfo) {
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

  public AlarmsGet200ResponseValue correlatedNotifications(List<@Valid CorrelatedNotification> correlatedNotifications) {
    this.correlatedNotifications = correlatedNotifications;
    return this;
  }

  public AlarmsGet200ResponseValue addCorrelatedNotificationsItem(CorrelatedNotification correlatedNotificationsItem) {
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

  public AlarmsGet200ResponseValue stateChangeDefinition(List<@Valid Map<String, Object>> stateChangeDefinition) {
    this.stateChangeDefinition = stateChangeDefinition;
    return this;
  }

  public AlarmsGet200ResponseValue addStateChangeDefinitionItem(Map<String, Object> stateChangeDefinitionItem) {
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

  public AlarmsGet200ResponseValue monitoredAttributes(Map<String, Object> monitoredAttributes) {
    this.monitoredAttributes = monitoredAttributes;
    return this;
  }

  public AlarmsGet200ResponseValue putMonitoredAttributesItem(String key, Object monitoredAttributesItem) {
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

  public AlarmsGet200ResponseValue proposedRepairActions(String proposedRepairActions) {
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

  public AlarmsGet200ResponseValue additionalText(String additionalText) {
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

  public AlarmsGet200ResponseValue additionalInformation(Map<String, Object> additionalInformation) {
    this.additionalInformation = additionalInformation;
    return this;
  }

  public AlarmsGet200ResponseValue putAdditionalInformationItem(String key, Object additionalInformationItem) {
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

  public AlarmsGet200ResponseValue rootCauseIndicator(Boolean rootCauseIndicator) {
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

  public AlarmsGet200ResponseValue ackTime(OffsetDateTime ackTime) {
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

  public AlarmsGet200ResponseValue ackUserId(String ackUserId) {
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

  public AlarmsGet200ResponseValue ackSystemId(String ackSystemId) {
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

  public AlarmsGet200ResponseValue ackState(AckState ackState) {
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

  public AlarmsGet200ResponseValue clearUserId(String clearUserId) {
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

  public AlarmsGet200ResponseValue clearSystemId(String clearSystemId) {
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

  public AlarmsGet200ResponseValue serviceUser(String serviceUser) {
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

  public AlarmsGet200ResponseValue serviceProvider(String serviceProvider) {
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

  public AlarmsGet200ResponseValue securityAlarmDetector(String securityAlarmDetector) {
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

  public AlarmsGet200ResponseValue lastNotificationHeader(NotificationHeader lastNotificationHeader) {
    this.lastNotificationHeader = lastNotificationHeader;
    return this;
  }

  /**
   * Get lastNotificationHeader
   * @return lastNotificationHeader
  */
  @Valid 
  @Schema(name = "lastNotificationHeader", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastNotificationHeader")
  public NotificationHeader getLastNotificationHeader() {
    return lastNotificationHeader;
  }

  public void setLastNotificationHeader(NotificationHeader lastNotificationHeader) {
    this.lastNotificationHeader = lastNotificationHeader;
  }

  public AlarmsGet200ResponseValue comments(Map<String, Comment> comments) {
    this.comments = comments;
    return this;
  }

  public AlarmsGet200ResponseValue putCommentsItem(String key, Comment commentsItem) {
    if (this.comments == null) {
      this.comments = new HashMap<>();
    }
    this.comments.put(key, commentsItem);
    return this;
  }

  /**
   * Collection of comments. The comment identifiers are allocated by the MnS producer and used as key in the map.
   * @return comments
  */
  @Valid 
  @Schema(name = "comments", description = "Collection of comments. The comment identifiers are allocated by the MnS producer and used as key in the map.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("comments")
  public Map<String, Comment> getComments() {
    return comments;
  }

  public void setComments(Map<String, Comment> comments) {
    this.comments = comments;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlarmsGet200ResponseValue alarmsGet200ResponseValue = (AlarmsGet200ResponseValue) o;
    return Objects.equals(this.objectInstance, alarmsGet200ResponseValue.objectInstance) &&
        Objects.equals(this.notificationId, alarmsGet200ResponseValue.notificationId) &&
        Objects.equals(this.alarmRaisedTime, alarmsGet200ResponseValue.alarmRaisedTime) &&
        Objects.equals(this.alarmChangedTime, alarmsGet200ResponseValue.alarmChangedTime) &&
        Objects.equals(this.alarmClearedTime, alarmsGet200ResponseValue.alarmClearedTime) &&
        Objects.equals(this.alarmType, alarmsGet200ResponseValue.alarmType) &&
        Objects.equals(this.probableCause, alarmsGet200ResponseValue.probableCause) &&
        Objects.equals(this.specificProblem, alarmsGet200ResponseValue.specificProblem) &&
        Objects.equals(this.perceivedSeverity, alarmsGet200ResponseValue.perceivedSeverity) &&
        Objects.equals(this.backedUpStatus, alarmsGet200ResponseValue.backedUpStatus) &&
        Objects.equals(this.backUpObject, alarmsGet200ResponseValue.backUpObject) &&
        Objects.equals(this.trendIndication, alarmsGet200ResponseValue.trendIndication) &&
        Objects.equals(this.thresholdinfo, alarmsGet200ResponseValue.thresholdinfo) &&
        Objects.equals(this.correlatedNotifications, alarmsGet200ResponseValue.correlatedNotifications) &&
        Objects.equals(this.stateChangeDefinition, alarmsGet200ResponseValue.stateChangeDefinition) &&
        Objects.equals(this.monitoredAttributes, alarmsGet200ResponseValue.monitoredAttributes) &&
        Objects.equals(this.proposedRepairActions, alarmsGet200ResponseValue.proposedRepairActions) &&
        Objects.equals(this.additionalText, alarmsGet200ResponseValue.additionalText) &&
        Objects.equals(this.additionalInformation, alarmsGet200ResponseValue.additionalInformation) &&
        Objects.equals(this.rootCauseIndicator, alarmsGet200ResponseValue.rootCauseIndicator) &&
        Objects.equals(this.ackTime, alarmsGet200ResponseValue.ackTime) &&
        Objects.equals(this.ackUserId, alarmsGet200ResponseValue.ackUserId) &&
        Objects.equals(this.ackSystemId, alarmsGet200ResponseValue.ackSystemId) &&
        Objects.equals(this.ackState, alarmsGet200ResponseValue.ackState) &&
        Objects.equals(this.clearUserId, alarmsGet200ResponseValue.clearUserId) &&
        Objects.equals(this.clearSystemId, alarmsGet200ResponseValue.clearSystemId) &&
        Objects.equals(this.serviceUser, alarmsGet200ResponseValue.serviceUser) &&
        Objects.equals(this.serviceProvider, alarmsGet200ResponseValue.serviceProvider) &&
        Objects.equals(this.securityAlarmDetector, alarmsGet200ResponseValue.securityAlarmDetector) &&
        Objects.equals(this.lastNotificationHeader, alarmsGet200ResponseValue.lastNotificationHeader) &&
        Objects.equals(this.comments, alarmsGet200ResponseValue.comments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectInstance, notificationId, alarmRaisedTime, alarmChangedTime, alarmClearedTime, alarmType, probableCause, specificProblem, perceivedSeverity, backedUpStatus, backUpObject, trendIndication, thresholdinfo, correlatedNotifications, stateChangeDefinition, monitoredAttributes, proposedRepairActions, additionalText, additionalInformation, rootCauseIndicator, ackTime, ackUserId, ackSystemId, ackState, clearUserId, clearSystemId, serviceUser, serviceProvider, securityAlarmDetector, lastNotificationHeader, comments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlarmsGet200ResponseValue {\n");
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
    sb.append("    lastNotificationHeader: ").append(toIndentedString(lastNotificationHeader)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
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

