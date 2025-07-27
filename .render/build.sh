#!/usr/bin/env bash

echo "JAVA_HOME set to $RENDER_RUNTIME_JAVA_HOME"
export JAVA_HOME="$RENDER_RUNTIME_JAVA_HOME"
export PATH="$JAVA_HOME/bin:$PATH"

# Javaの存在確認（デバッグ用）
java -version

# Maven Wrapperでビルド
./mvnw clean package

