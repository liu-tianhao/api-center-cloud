#!/bin/sh
APP_VERSION=2.0.0-SNAPSHOT
# Specify the directory you want to delete
dir_path="/opt/api-center-cloud/docker"

# Check if the directory exists
if [ -d "$dir_path" ]; then
  # If it exists, remove it recursively
  rm -rf "$dir_path"
else
  # If it doesn't exist, skip
  echo "Directory does not exist."
fi

unzip /opt/api-center-cloud/docker.zip -d /opt/api-center-cloud &&

cd /opt/api-center-cloud/docker &&

if docker-compose ps | grep "system-cloud-gateway"; then
  docker-compose -f /opt/api-center-cloud/docker/docker-compose.yml down
  docker rmi $(docker images | grep "system-cloud" | awk '{print $3}')
else
  echo "The container is not running."
fi

