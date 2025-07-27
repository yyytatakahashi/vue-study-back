#!/usr/bin/env bash

# Javaの環境変数を設定
export JAVA_HOME="/opt/render/project/.java/openjdk"
export PATH="$JAVA_HOME/bin:$PATH"

# Maven Wrapperでビルド
./mvnw clean package

