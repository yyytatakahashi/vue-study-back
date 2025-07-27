#!/usr/bin/env bash

# Render 環境の JAVA_HOME 対応
if [ -d "/opt/render/project/.java/openjdk" ]; then
  export JAVA_HOME="/opt/render/project/.java/openjdk"
elif [ -d "/opt/render/project/java/openjdk" ]; then
  export JAVA_HOME="/opt/render/project/java/openjdk"
else
  echo "No valid JAVA_HOME found"
  exit 1
fi

export PATH="$JAVA_HOME/bin:$PATH"

# 実行
./mvnw clean package


