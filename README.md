# Makersharks-Assessment

# Supplier Search Application

## Overview

This application is designed to search for suppliers based on location, nature of business, and manufacturing processes. It uses Spring Boot to provide a RESTful API for querying supplier data. The application also includes Swagger for API documentation.

## Project Structure

- **Controller**: Handles HTTP requests and responses.
- **Service**: Contains the business logic and interacts with the repository.
- **Repository**: Interfaces with the database.
- **Model**: Defines the data structure for the `Supplier` entity.
- **Configuration**: Configures Swagger for API documentation.

## Requirements

- Java 11 or later
- Maven 3.6 or later
- A running instance of a SQL database (e.g., MySQL)

## Setup

1. **Clone the Repository**

   ```bash
   git clone https://github.com/yourusername/supplier-search-app.git
   cd supplier-search-app

curl -X POST "http://localhost:8080/api/supplier/query" \
     -d "location=Location1" \
     -d "natureOfBusiness=Business1" \
     -d "manufacturingProcess=Process1" \
     -d "page=0" \
     -d "size=10" \
     -H "Content-Type: application/x-www-form-urlencoded"


### **Additional Information**

- **Swagger Configuration**: The Swagger UI is configured in `SwaggerConfig.java` and will be available at `/swagger-ui.html` when the application is running.
- **Database Table**: Ensure that the `Supplier` table in your database matches the schema defined in the `Supplier` entity.
