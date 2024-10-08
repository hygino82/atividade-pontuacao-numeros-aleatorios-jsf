#!/bin/sh
mvn clean package && docker build -t br.dev.hygino/VerificaSomaAtividade .
docker rm -f VerificaSomaAtividade || true && docker run -d -p 9080:9080 -p 9443:9443 --name VerificaSomaAtividade br.dev.hygino/VerificaSomaAtividade