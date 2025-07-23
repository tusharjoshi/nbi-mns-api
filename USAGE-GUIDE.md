# How to Use the 3GPP NBI API Library

## Step 1: Add the Library Dependency

Add this to your `build.gradle` file:

```gradle
dependencies {
    implementation 'com.ems:nbi-mns-api:1.0.0'
    
    // If you want OpenAPI documentation
    implementation 'org.springdoc:springdoc-openapi-starter-webmvc-ui:2.3.0'
}
```

## Step 2: Configure Application Properties

Add these to `application.yml`:

```yaml
fault-mns:
  base-path: "/api/v1/fault-mns"
  enable-docs: true
  enable-validation: true
  max-alarms-per-response: 500

# Optional: Enable Swagger UI
springdoc:
  swagger-ui:
    path: /swagger-ui.html
    enabled: true
```

## Step 3: Implement the API

Create a controller that implements the `FaultApi` interface:

```java
package com.example.myapp.controller;

import com.ems.faultmns.api.FaultApi;
import com.ems.faultmns.model.*;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;

@Controller
public class MyFaultController implements FaultApi {

    @Override
    public ResponseEntity<Map<String, AlarmsGet200ResponseValue>> alarmsGet(
            AlarmAckState alarmAckState, 
            String baseObjectInstance, 
            String filter) {
        
        // Your business logic here
        Map<String, AlarmsGet200ResponseValue> alarms = new HashMap<>();
        
        // Example alarm
        AlarmsGet200ResponseValue alarm = new AlarmsGet200ResponseValue();
        // Set alarm properties...
        alarms.put("alarm-001", alarm);
        
        return ResponseEntity.ok(alarms);
    }

    @Override
    public ResponseEntity<AlarmCount> alarmsAlarmCountGet(
            AlarmAckState alarmAckState, 
            String filter) {
        
        AlarmCount count = new AlarmCount();
        count.setCriticalCount(5);
        count.setMajorCount(10);
        count.setMinorCount(15);
        count.setWarningCount(20);
        count.setIndeterminateCount(2);
        count.setClearedCount(100);
        
        return ResponseEntity.ok(count);
    }

    // Implement other required methods...
    
    @Override
    public ResponseEntity<Void> alarmsAlarmIdPatch(
            String alarmId, 
            AlarmsAlarmIdPatchRequest request) {
        // Handle alarm acknowledgment/clearing
        return ResponseEntity.noContent().build();
    }

    @Override
    public ResponseEntity<Comment> alarmsAlarmIdCommentsPost(
            String alarmId, 
            Comment comment) {
        // Add comment to alarm
        comment.setCommentTime(OffsetDateTime.now());
        return ResponseEntity.status(201).body(comment);
    }

    @Override
    public ResponseEntity<Void> alarmsPatch(AlarmsPatchRequest request) {
        // Handle batch operations
        return ResponseEntity.noContent().build();
    }

    @Override
    public ResponseEntity<Subscription> subscriptionsPost(Subscription subscription) {
        // Create subscription
        return ResponseEntity.status(201).body(subscription);
    }

    @Override
    public ResponseEntity<Void> subscriptionsSubscriptionIdDelete(String subscriptionId) {
        // Delete subscription
        return ResponseEntity.noContent().build();
    }
}
```

## Step 4: Create a Service Layer (Optional)

```java
package com.example.myapp.service;

import com.ems.faultmns.model.*;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class AlarmService {
    
    public AlarmRecord createAlarm(String objectInstance, PerceivedSeverity severity, String additionalText) {
        AlarmRecord alarm = new AlarmRecord();
        alarm.setObjectInstance(objectInstance);
        alarm.setPerceivedSeverity(severity);
        alarm.setAdditionalText(additionalText);
        alarm.setAlarmRaisedTime(OffsetDateTime.now());
        alarm.setAckState(AckState.UNACKNOWLEDGED);
        return alarm;
    }
    
    public List<AlarmRecord> getActiveAlarms() {
        List<AlarmRecord> alarms = new ArrayList<>();
        // Your implementation here
        return alarms;
    }
    
    public void acknowledgeAlarm(String alarmId, String userId) {
        // Your implementation here
    }
    
    public void clearAlarm(String alarmId, String userId) {
        // Your implementation here
    }
}
```

## Step 5: Run Your Application

That's it! The library will be automatically configured when you start your Spring Boot application.

## Testing the API

Once your application is running, you can:

1. **View API Documentation**: Visit `http://localhost:8080/swagger-ui.html`
2. **Test Endpoints**: Use the Swagger UI or tools like curl/Postman

### Example API Calls:

```bash
# Get all alarms
curl "http://localhost:8080/api/v1/fault-mns/alarms"

# Get alarm count
curl "http://localhost:8080/api/v1/fault-mns/alarms/alarmCount"

# Acknowledge an alarm
curl -X PATCH "http://localhost:8080/api/v1/fault-mns/alarms/alarm-123" \
  -H "Content-Type: application/merge-patch+json" \
  -d '{"ackState": "ACKNOWLEDGED"}'
```

## Configuration Options

All available configuration properties with their defaults:

```yaml
fault-mns:
  base-path: "/fault-mns"              # API base path
  enable-docs: true                    # Enable OpenAPI docs
  enable-validation: true              # Enable request validation
  max-alarms-per-response: 1000        # Max alarms per response
```

## Advanced Usage

### Custom Error Handling

```java
@ControllerAdvice
public class FaultApiExceptionHandler {
    
    @ExceptionHandler(ValidationException.class)
    public ResponseEntity<ErrorResponse> handleValidation(ValidationException e) {
        ErrorResponse error = new ErrorResponse();
        error.setDetail(e.getMessage());
        return ResponseEntity.badRequest().body(error);
    }
}
```

### Custom Jackson Configuration

The library automatically configures Jackson for proper serialization, but you can override:

```java
@Configuration
public class CustomJacksonConfig {
    
    @Bean
    @Primary
    public ObjectMapper customObjectMapper() {
        return new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
    }
}
```
