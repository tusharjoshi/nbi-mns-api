
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

## Usage

Add this library as a dependency to your Spring Boot project:

```gradle
dependencies {
    implementation 'com.ems:nbi-mns-api:1.0.0'
    // Spring Boot dependencies for runtime
    implementation 'org.springframework.boot:spring-boot-starter-web'
    implementation 'org.springframework.boot:spring-boot-starter-validation'
}
```

## How It Works

1. **Repository Setup**: The build automatically clones the official 3GPP MnS repository from <https://forge.3gpp.org/rep/sa5/MnS.git>
2. **Branch Checkout**: Switches to the Rel-17 branch for stable specifications  
3. **API Generation**: Uses OpenAPI Generator to create Spring Boot interfaces from the YAML specifications
4. **Compilation**: Compiles the generated code into a distributable JAR
