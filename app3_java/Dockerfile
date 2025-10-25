# Use an official Java runtime as base image
FROM openjdk:17-slim

# Set working directory inside container
WORKDIR /app

# Copy source code into container
COPY RandomNumber.java .

# Compile the Java file
RUN javac RandomNumber.java

# Command to run the application
CMD ["java", "RandomNumber"]


