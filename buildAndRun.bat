@echo off
call mvn clean package
call docker build -t br.dev.hygino/VerificaSomaAtividade .
call docker rm -f VerificaSomaAtividade
call docker run -d -p 9080:9080 -p 9443:9443 --name VerificaSomaAtividade br.dev.hygino/VerificaSomaAtividade