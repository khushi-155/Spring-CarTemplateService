# Attendant Management System

This project implements a Spring Boot web application for managing attendants. 

## Features:
- Display attendant details based on `attendentId`.
- Uses `ModelMap` to pass data to JSP pages.
- Dynamic JSP rendering for attendant details.

## Endpoints:
- `GET /attendent/{attendentId}` - Fetches and displays attendant details.

## Installation & Setup:
1. Clone the repository:
   ```sh
   git clone https://github.com/your-repo-name.git
   cd your-repo-name
mvn spring-boot:run
http://localhost:8080/success
src/main/java/com/example/controller/AttendantController.java
src/main/webapp/WEB-INF/views/success.jsp
src/main/webapp/WEB-INF/views/attendent.jsp
