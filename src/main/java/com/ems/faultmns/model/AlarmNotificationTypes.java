package com.ems.faultmns.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets AlarmNotificationTypes
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public enum AlarmNotificationTypes {
  
  NOTIFYNEWALARM("notifyNewAlarm"),
  
  NOTIFYCHANGEDALARM("notifyChangedAlarm"),
  
  NOTIFYCHANGEDALARMGENERAL("notifyChangedAlarmGeneral"),
  
  NOTIFYACKSTATECHANGED("notifyAckStateChanged"),
  
  NOTIFYCORRELATEDNOTIFICATIONCHANGED("notifyCorrelatedNotificationChanged"),
  
  NOTIFYCOMMENTS("notifyComments"),
  
  NOTIFYCLEAREDALARM("notifyClearedAlarm"),
  
  NOTIFYALARMLISTREBUILT("notifyAlarmListRebuilt"),
  
  NOTIFYPOTENTIALFAULTYALARMLIST("notifyPotentialFaultyAlarmList");

  private String value;

  AlarmNotificationTypes(String value) {
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
  public static AlarmNotificationTypes fromValue(String value) {
    for (AlarmNotificationTypes b : AlarmNotificationTypes.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

