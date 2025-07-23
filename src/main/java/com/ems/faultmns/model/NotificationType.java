package com.ems.faultmns.model;

import java.net.URI;
import java.util.Objects;
import com.ems.faultmns.model.AlarmNotificationTypes;
import com.ems.faultmns.model.CmNotificationTypes;
import com.ems.faultmns.model.FileNotificationTypes;
import com.ems.faultmns.model.HeartbeatNotificationTypes;
import com.ems.faultmns.model.PerfNotificationTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public interface NotificationType {
}
