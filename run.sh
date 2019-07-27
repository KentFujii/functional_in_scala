#!/bin/bash

docker pull mozilla/sbt
docker run -it -v=$(pwd):/app -w /app  mozilla/sbt sbt
