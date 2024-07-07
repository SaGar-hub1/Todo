# Todo Application

## Overview

This repository contains a Todo application built using Spring Boot, Angular, Bootstrap, and MySQL. The application allows users to manage their daily tasks efficiently. Users can create, update, delete, and view their todo items.

## Table of Contents

- [Features](#features)
- [Technologies Used](#technologies-used)
- [Architecture](#architecture)
- [Setup and Installation](#setup-and-installation)
- [Usage](#usage)
- [Contributing](#contributing)

## Features

- User authentication and authorization
- Create, read, update, and delete (CRUD) operations for todo items
- Responsive user interface
- Real-time updates
- Input validation

## Technologies Used

- **Backend:**
  - Spring Boot
  - Spring Security
  - MySQL
  - JPA/Hibernate

- **Frontend:**
  - Angular
  - Bootstrap

## Architecture

The application follows a multi-tier architecture with a clear separation of concerns:

1. **Presentation Layer:** Handled by Angular and Bootstrap to provide a responsive and interactive user interface.
2. **Business Logic Layer:** Managed by Spring Boot, which handles the application logic and communicates with the data layer.
3. **Data Access Layer:** Uses JPA/Hibernate to interact with the MySQL database.

## Setup and Installation

### Prerequisites

Ensure you have the following installed:

- Java Development Kit (JDK) 11 or higher
- Node.js and npm
- Angular CLI
- MySQL Server

### Backend Setup

1. Clone the repository:
    ```bash
    git clone https://github.com/SaGar-hub1/Todo.git
    cd Todo/backend
    ```

2. Update MySQL configuration in `application.properties`:
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/todo_db
    spring.datasource.username=your_username
    spring.datasource.password=your_password
    ```

3. Build and run the Spring Boot application:
    ```bash
    ./mvnw spring-boot:run
    ```

### Frontend Setup

1. Navigate to the frontend directory:
    ```bash
    cd Todo/frontend
    ```

2. Install dependencies:
    ```bash
    npm install
    ```

3. Run the Angular application:
    ```bash
    ng serve
    ```

### Database Setup

1. Create a MySQL database:
    ```sql
    CREATE DATABASE todo_db;
    ```

2. The database schema will be automatically created by JPA on application startup.

## Usage

1. Open a web browser and navigate to `http://localhost:4200`.
2. Start managing your todos by adding, editing, or deleting tasks.

## Contributing

Contributions are welcome! Please follow these steps to contribute:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Make your changes and commit them (`git commit -m 'Add new feature'`).
4. Push to the branch (`git push origin feature-branch`).
5. Open a Pull Request.
