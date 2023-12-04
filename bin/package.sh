#!/bin/sh
APP_VERSION=1.0.0
mvn clean package -Dmaven.test.skip &&
cp -r doc/docker . &&
mv system-cloud-book/target/system-cloud-book-$APP_VERSION.jar docker/system-cloud-book/ &&
mv system-cloud-account/target/system-cloud-account-$APP_VERSION.jar docker/system-cloud-account/ &&
mv system-cloud-gateway/target/system-cloud-gateway-$APP_VERSION.jar docker/system-cloud-gateway/ &&
mv system-cloud-homepage/target/system-cloud-homepage-$APP_VERSION.jar docker/system-cloud-homepage/ &&
zip -r docker.zip docker &&
rm -rf docker