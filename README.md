# StartSharp Automation Project

This project automates tests for the StartSharp web application. It includes two tests: one verifying the correct creation of a business unit (organization) in the system, and another verifying the correct scheduling of a meeting according to specified parameters. The project follows the Page Object Model (POM) design pattern.

## Table of Contents
- [General Information](#general-information)
- [Project Structure](#project-structure)
- [Dependencies](#dependencies)
- [Running Tests](#running-tests)
- [Jenkins and SonarQube Integration](#jenkins-and-sonarqube-integration)
- [Contributing](#contributing)
- [Author](#author)

## General Information
- **Project Purpose**: Automate tests for StartSharp web application.
- **Tests Implemented**:
  1. **Business Unit Creation**: Verifies the correct creation of a business unit (organization).
  2. **Meeting Scheduling**: Verifies the correct scheduling of a meeting with specified parameters.
- **Design Pattern**: Page Object Model (POM).
- **Documentation**: The `Informe.pdf` file contains the resolution to some of the criteria outlined in the technical test.

## Project Structure
`
StartSharpAutomation/
├── src/
│ ├── main/
│ │ └── java/
│ └── test/
│ └── java/
│ └── co/
│ └── choucair/
│ └── runners/
│ └── Runner.java
├── build.gradle
├── Jenkinsfile
├── sonar-project.properties
└── README.md `

markdown
Copiar código

## Dependencies
This project uses the following dependencies:
- Java 8
- Cucumber
- Gradle
- Serenity
- Hamcrest
- WebDriverManager
- SLF4J
- Jacoco

Dependencies are defined in the `build.gradle` file.

## Running Tests
Each feature can be executed from the `Runner` class located at:
src/test/java/co/choucair/runners/Runner.java

## Jenkins and SonarQube Integration

Jenkins: The Jenkinsfile allows for proper synchronization with Jenkins.
SonarQube: The sonar-project.properties file allows for proper synchronization with SonarQube.

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request.

Fork the repository.
Create your feature branch (git checkout -b feature/YourFeature).
Commit your changes (git commit -m 'Add your feature').
Push to the branch (git push origin feature/YourFeature).
Open a pull request.

## Author

Jinson Stevenson Moreno Aguilar - jinson.moreno@gmail.com
