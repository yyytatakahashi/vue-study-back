#!/usr/bin/env bash

export JAVA_HOME=/opt/render/project/.java/openjdk
export PATH=$JAVA_HOME/bin:$PATH

./mvnw clean package

