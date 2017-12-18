#!/bin/sh
git pull
$(pwd)/mvnw clean package -DskipTests=true
kill -9 $(cat application.pid 2>/dev/null) 2>/dev/null
nohup java -jar -Dspring.profiles.active=stage target/insurance-0.0.1-SNAPSHOT.jar >nohup.out  2>&1 &