# 3GPP NBI MnS API Example Application

This example Spring Boot application demonstrates how to implement the 3GPP Management Services (MnS) APIs using the `nbi-mns-api-lib` library.

## Features

### Implemented APIs
- **Fault Management Service (FaultMnS)** - Complete implementation of TS28532_FaultMnS
  - Alarm retrieval and management
  - Alarm acknowledgment and clearing
  - Alarm comments
  - Subscription management
  - Notification endpoints

### Key Components
- `FaultMnsController` - Example implementation of the FaultApi interface
- `ExampleApplicationConfig` - Configuration for OpenAPI documentation and CORS
- In-memory storage for demonstration purposes
- Sample alarm data for testing

## Getting Started

### Prerequisites
- Java 17 or higher
- The `nbi-mns-api-lib` must be built (see parent project README)

### Running the Application

```bash
# From the example directory
../gradlew bootRun

# Or from the root project directory
./gradlew :nbi-mns-api-example:bootRun
```

The application will start on `http://localhost:8080`.

### API Documentation

Once running, you can access:
- **Swagger UI**: http://localhost:8080/swagger-ui.html
- **OpenAPI JSON**: http://localhost:8080/api-docs
- **Health Check**: http://localhost:8080/actuator/health

## API Endpoints

### Fault Management Service

#### Alarm Operations
- `GET /api/v1/alarms` - Retrieve multiple alarms
- `PATCH /api/v1/alarms` - Update multiple alarms
- `GET /api/v1/alarms/alarmCount` - Get alarm count by severity
- `PATCH /api/v1/alarms/{alarmId}` - Update a specific alarm
- `POST /api/v1/alarms/{alarmId}/comments` - Add comment to alarm

#### Subscription Operations
- `POST /api/v1/subscriptions` - Create subscription
- `DELETE /api/v1/subscriptions/{subscriptionId}` - Delete subscription

#### Notification Endpoints
- `POST /notify*` - Various notification endpoints for alarm events

## Sample Data

The application initializes with sample alarms of different severities:
- CRITICAL: Communication System Failure
- MAJOR: High CPU Usage  
- MINOR: License Expiry Warning
- WARNING: Low Disk Space

## Testing the API

### Get All Alarms
```bash
curl -X GET "http://localhost:8080/api/v1/alarms" \
  -H "accept: application/json"
```

### Get Alarm Count
```bash
curl -X GET "http://localhost:8080/api/v1/alarms/alarmCount" \
  -H "accept: application/json"
```

### Add Comment to Alarm
```bash
curl -X POST "http://localhost:8080/api/v1/alarms/1/comments" \
  -H "accept: application/json" \
  -H "Content-Type: application/json" \
  -d '{
    "commentText": "Investigating the issue",
    "commentUserId": "engineer1"
  }'
```

### Create Subscription
```bash
curl -X POST "http://localhost:8080/api/v1/subscriptions" \
  -H "accept: application/json" \
  -H "Content-Type: application/json" \
  -d '{
    "consumerReference": "http://consumer.example.com/notifications",
    "filter": "objectClass==NetworkElement"
  }'
```

## Configuration

The application can be configured through `application.yml`:

```yaml
nbi:
  mns:
    fault-mns-enabled: true    # Enable Fault Management Service
    perf-mns-enabled: true     # Enable Performance Management Service
    base-path: /api/v1         # API base path
    api-documentation-enabled: true  # Enable OpenAPI docs
```

## Implementation Notes

### Production Considerations
This is a demonstration implementation with in-memory storage. For production use, consider:

1. **Persistent Storage**: Replace in-memory maps with database persistence
2. **Authentication & Authorization**: Add security for API endpoints
3. **Validation**: Enhance input validation and error handling
4. **Monitoring**: Add metrics and monitoring capabilities
5. **Scalability**: Consider clustering and load balancing
6. **Integration**: Connect to actual network management systems

### Extending the Implementation
To extend this example:

1. **Add Performance MnS**: Implement the PerfApi interface
2. **Database Integration**: Add JPA entities and repositories
3. **Security**: Add Spring Security configuration
4. **Additional APIs**: Implement other MnS interfaces as needed
5. **Custom Business Logic**: Add domain-specific alarm processing

## Architecture

```
┌─────────────────────────────────────┐
│        Example Application          │
├─────────────────────────────────────┤
│  FaultMnsController                 │
│  ExampleApplicationConfig           │
│  NbiMnsExampleApplication           │
└─────────────────────────────────────┘
                    │
┌─────────────────────────────────────┐
│         nbi-mns-api-lib             │
├─────────────────────────────────────┤
│  FaultApi (Generated Interface)     │
│  Model Classes (Generated)          │
│  Auto-Configuration                 │
└─────────────────────────────────────┘
                    │
┌─────────────────────────────────────┐
│    3GPP OpenAPI Specifications     │
├─────────────────────────────────────┤
│  TS28532_FaultMnS.yaml             │
│  TS28532_PerfMnS.yaml              │
│  ... (other specifications)        │
└─────────────────────────────────────┘
```

## References

- [3GPP TS 28.532](https://www.3gpp.org/ftp/Specs/archive/28_series/28.532/) - Generic management services
- [3GPP Forge MnS Repository](https://forge.3gpp.org/rep/sa5/MnS) - Official OpenAPI specifications
- [Spring Boot Documentation](https://spring.io/projects/spring-boot)
- [OpenAPI Generator](https://openapi-generator.tech/)
