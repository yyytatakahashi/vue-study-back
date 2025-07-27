#!/usr/bin/env bash

# JAVA_HOME を明示的に設定
export JAVA_HOME="/opt/render/project/.java/openjdk"
export PATH="$JAVA_HOME/bin:$PATH"

# Maven Wrapper でビルド
./mvnw clean package


