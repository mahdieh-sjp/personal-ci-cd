# Java CI/CD & Docker Pipeline Showcase

This repository serves as a proof-of-concept demonstrating a complete, automated Continuous Integration and Continuous Delivery (CI/CD) pipeline. It features a Java 17 application built with Gradle, fully tested with JUnit 5, and automatically containerized and published to Docker Hub via GitHub Actions.

## 🚀 Key Technologies
* **Language:** Java 17
* **Build Tool:** Gradle
* **Testing Framework:** JUnit 5 (Jupiter)
* **CI/CD:** GitHub Actions
* **Containerization:** Docker
* **Registry:** Docker Hub

## ⚙️ CI/CD Pipeline Architecture
Every push or pull request to the `main` branch triggers an automated GitHub Actions workflow that executes the following stages:

1. **Environment Setup:** Provisions a fresh Ubuntu runner and installs JDK 17.
2. **Automated Testing & Build:** Executes `./gradlew clean build` to compile the code and run the JUnit 5 test suite.
3. **Artifact Archiving:** Uploads the compiled `.jar` file and HTML test reports as GitHub Artifacts for easy download and review.
4. **Containerization:** Builds a Docker image using a custom `Dockerfile` based on `eclipse-temurin:17-jdk-alpine`.
5. **Continuous Delivery:** Authenticates and pushes the tagged Docker image directly to Docker Hub.
6. **Security Scanning:** Submits a dependency graph to GitHub to enable real-time Dependabot security alerts for transitive dependencies.

## 💻 How to Run the Application

Because this application is continuously delivered to Docker Hub, you can run it on any machine with Docker installed, without needing to configure a local Java or Gradle environment.

### Run via Docker (Recommended)
Pull the latest image from Docker Hub and execute it:
```bash
docker run --rm maddiesjp/demo:latest
```

### Build and Run Locally
If you prefer to compile the project from the source code:
```bash
# Clone the repository
git clone <your-repo-url>
cd <your-repo-directory>

# Build the project and run tests
./gradlew clean build

# Run the compiled JAR
java -jar build/libs/personal-ci-cd.jar
```

## 🧪 Testing
This project implements unit testing using **JUnit 5**. The test suite verifies application logic, including conditional statements, mathematical outputs, and string manipulation. 

To run the test suite locally:
```bash
./gradlew clean test
```

## 📂 Project Structure
* `src/main/java/com/maddie/TestApp.java`: Main application logic.
* `src/test/java/com/maddie/TestAppTest.java`: JUnit 5 test suite.
* `build.gradle`: Project dependencies and configuration.
* `Dockerfile`: Instructions for packaging the application into a minimal Java 17 alpine container.
* `.github/workflows/ci.yml`: The GitHub Actions CI/CD configuration file.
