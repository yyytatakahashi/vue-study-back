#!/usr/bin/env bash

# Java のパスを直接指定（Render 固定パス）
export JAVA_HOME="/opt/render/project/.java/openjdk"
export PATH="$JAVA_HOME/bin:$PATH"

# デバッグ表示
echo "JAVA_HOME set to $JAVA_HOME"
java -version

# Maven Wrapper でビルド
./mvnw clean package

