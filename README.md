# Dad Joke API Integration Service

This project is a Spring Boot application that integrates with a third-party Dad Joke API to retrieve random jokes and search for jokes based on user-defined terms. The application uses **Spring WebFlux** for non-blocking asynchronous API calls and **Spring Shell** for command-line interactions.

## Table of Contents
- [Project Overview](#project-overview)
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
- [Configuration](#configuration)
- [Running the Application](#running-the-application)
- [Available Shell Commands](#available-shell-commands)
- [Error Handling](#error-handling)
- [Future Enhancements](#future-enhancements)

## Project Overview

The Dad Joke API Integration Service allows users to:
- Fetch a random dad joke.
- Search for dad jokes based on a search term.
- Interact with the application via the command line using **Spring Shell**.

### Features:
- Non-blocking API calls with **Spring WebFlux**.
- Reactive programming with **Project Reactor**.
- Shell-based user interaction with **Spring Shell**.

## Technologies Used

- **Java 17**: The language used for building the application.
- **Spring Boot 3**: Provides a robust framework for developing Java-based applications.
- **Spring WebFlux**: Handles asynchronous and non-blocking API calls to the Dad Joke API.
- **Spring Shell**: Enables command-line interactions for querying jokes.
- **Lombok**: Reduces boilerplate code (annotations like `@Getter`, `@Setter`, etc.).
- **Maven**: Build automation and dependency management.

## Getting Started

### Prerequisites
To run this project, you need the following installed on your system:
- Java 17 or higher
- Maven 3.6 or higher

### Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/dad-joke-api.git
   cd dad-joke-api
   ```
2. Build the project: 
```bash
   mvn spring-boot:run
```


### Configuration

You need to configure the base URL for the Dad Joke API. 
Create a ```application.yml``` file inside the ```src/main/resources``` directory with the following content:

```bash
dad:
  joke:
    url: https://icanhazdadjoke.com
```
This configuration points to the Dad Joke API. Adjust the URL if the third-party API changes.


### Running the Application
To run the Spring Boot application with Spring Shell, execute the following command:

```bash
mvn spring-boot:run
```
Once the application is running, you'll be presented with a shell where you can run commands to fetch jokes.

### Available Shell Commands

- `random`: Get a random dad joke
- `search`: Search for dad jokes based on a search term
