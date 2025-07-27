#!/usr/bin/env bash

# Render が提供してる Java の場所を自動検出して使う
if [ -d "/opt/render/.java" ]; then
  export JAVA_HOME="/opt/render/.java/openjdk"
elif [ -d "/opt/render/project/.java" ]; then
  export JAVA_HOME="/opt/render/project/.java/openjdk"
else
  echo "No valid JAVA_HOME found"
  exit 1
fi

export PATH="$JAVA_HOME/bin:$PATH"

# デバッグ出力
echo "Using JAVA_HOME: $JAVA_HOME"
java -version

# Maven Wrapper でビルド
./mvnw clean package


