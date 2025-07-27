#!/usr/bin/env bash

echo "Listing directories under /opt/render/project/"
ls -al /opt/render/project/

echo "Searching for java under /opt/render/"
find /opt/render/ -type d -name "*java*" || true

echo "Env:"
env | grep JAVA || true

exit 1  # 強制終了（検証用）

