#!/bin/bash

docker pull mozilla/sbt
docker run -it -v=$(pwd):/root mozilla/sbt sbt
