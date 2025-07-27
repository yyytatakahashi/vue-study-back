#!/usr/bin/env bash

# 明示的なログ出力
echo "------ START BUILD SCRIPT ------"

# RENDER_RUNTIME_JAVA_HOME が設定されているかチェック
if [ -z "$RENDER_RUNTIME_JAVA_HOME" ]; then
  echo "ERROR: RENDER_RUNTIME_JAVA_HOME is not set."
  exit 127
fi

export JAVA_HOME="$RENDER_RUNTIME_JAVA_HOME"
export PATH="$JAVA_HOME/bin:$PATH"

echo "JAVA_HOME is set to: $JAVA_HOME"
echo "Java version:"
java -version || { echo "Java command failed"; exit 127; }

echo "Checking mvnw..."
if [ ! -x "./mvnw" ]; then
  echo "ERROR: ./mvnw not found or not executable"
  ls -l ./mvnw
  exit 127
fi

echo "Running: ./mvnw clean package"
./mvnw clean package || { echo "Maven build failed"; exit 1; }

echo "------ BUILD SUCCESS ------"

