#!/usr/bin/env bash

# 正しいJAVA_HOMEを明示的に指定
export JAVA_HOME=/opt/render/project/java/openjdk
export PATH=$JAVA_HOME/bin:$PATH

./mvnw clean package


