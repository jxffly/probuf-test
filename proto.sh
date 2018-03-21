#!/usr/bin/env bash
ROOT_PATH=`dirname $0`
DIR=${ROOT_PATH}
JAVA_OUT=${DIR}/src/main/java
SOURCE=${DIR}/protoc/include/java/*

protoc/bin/protoc --proto_path=${DIR} --java_out=${JAVA_OUT} ${SOURCE}
echo "build class in "${JAVA_OUT}


