#!/usr/bin/env bash

# Render の Java ランタイム環境変数を使用
export JAVA_HOME="$RENDER_RUNTIME_JAVA_HOME"
export PATH="$JAVA_HOME/bin:$PATH"

echo "JAVA_HOME set to $JAVA_HOME"
java -version

# Maven Wrapper でビルド
./mvnw clean package


