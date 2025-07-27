#!/usr/bin/env bash

# Set JAVA_HOME from environment variable provided by Render
export JAVA_HOME="$RENDER_RUNTIME_JAVA_HOME"
export PATH="$JAVA_HOME/bin:$PATH"

echo "Using JAVA_HOME: $JAVA_HOME"

# Check if java and mvn are available
if ! command -v java >/dev/null 2>&1; then
  echo "Java is not available in PATH"
  exit 127
fi

if ! command -v ./mvnw >/dev/null 2>&1; then
  echo "mvnw not found or not executable"
  exit 127
fi

# Build with Maven wrapper
./mvnw clean package

