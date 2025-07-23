
# 3GPP NBI MnS API

A Java library providing Spring Boot interfaces for 3GPP Management Services (MnS) APIs, automatically generated from official 3GPP OpenAPI specifications.

## Features

- **Fault Management Service (FaultMnS)** - TS28532_FaultMnS
- **Performance Management Service (PerfMnS)** - TS28532_PerfMnS
- **Spring Boot 3** compatible interfaces
- **Jakarta EE** validation support
- **Jackson** JSON serialization
- **OpenAPI 3.0** compliant

## Source of OpenAPI specs

[3GPP Forge MnS Repository](https://forge.3gpp.org/rep/sa5/MnS.git) - Rel-17 branch

## Quick Start

### Prerequisites

- Java 17 or higher
- Git (for cloning 3GPP specifications)

### Building the Library

The build process automatically handles the 3GPP specification repository:

```bash
# Clean build (downloads 3GPP specs automatically)
./gradlew clean build

# Just setup the repository without building
./gradlew setupMnSRepository
```

### Available Gradle Tasks

#### Repository Setup Tasks

- `setupMnSRepository` - Ensure 3GPP MnS repository is cloned and up-to-date
- `cloneMnSRepository` - Clone the 3GPP MnS repository and checkout Rel-17 branch
- `updateMnSRepository` - Update existing repository to latest Rel-17 branch
- `cleanMnSRepository` - Remove cloned repository (will be re-cloned on next build)

#### API Generation Tasks

- `generatePerfMnSApi` - Generate Performance Management Service API
- `generateFaultMnSApi` - Generate Fault Management Service API

### Generated APIs

After building, the following interfaces will be available:

- `com.ems.perfmns.api.PerfApi` - Performance Management Service operations
- `com.ems.faultmns.api.FaultApi` - Fault Management Service operations
- Model classes in respective `model` packages

## Usage in Your Project

Add this library as a dependency to your Spring Boot project:

```gradle
dependencies {
    implementation 'com.ems:nbi-mns-api:1.0.0'
    // Spring Boot dependencies for runtime
    implementation 'org.springframework.boot:spring-boot-starter-web'
    implementation 'org.springframework.boot:spring-boot-starter-validation'
}
```

### Auto-Configuration

The library provides Spring Boot auto-configuration that automatically:

- Scans and registers the generated API interfaces
- Configures component scanning for FaultMnS and PerfMnS packages
- Enables API interfaces when the required classes are present on the classpath

### Configuration Properties

You can customize the library behavior using application properties:

```yaml
# application.yml
nbi:
  mns:
    fault-mns-enabled: true          # Enable/disable Fault Management Service API
    perf-mns-enabled: true           # Enable/disable Performance Management Service API
    base-path: "/api/v1"             # Custom base path for endpoints
    api-documentation-enabled: true  # Enable API documentation
```

Or using properties file:

```properties
# application.properties
nbi.mns.fault-mns-enabled=true
nbi.mns.perf-mns-enabled=true
nbi.mns.base-path=/api/v1
nbi.mns.api-documentation-enabled=true
```

### Implementation

To implement the API endpoints, create @RestController classes that implement the generated interfaces:

```java
@RestController
public class FaultManagementController implements FaultApi {
    
    @Override
    public ResponseEntity<List<AlarmRecord>> alarmsGet(/* parameters */) {
        // Your implementation here
        return ResponseEntity.ok(/* your alarm records */);
    }
    
    // Implement other methods...
}

@RestController 
public class PerformanceManagementController implements PerfApi {
    
    @Override
    public ResponseEntity<Void> notificationSinkPost(NotifyThresholdCrossing notification) {
        // Your implementation here
        return ResponseEntity.noContent().build();
    }
}
```