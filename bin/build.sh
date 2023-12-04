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

unzip /opt/novel-cloud/docker.zip -d /opt/novel-cloud &&

cd /opt/novel-cloud/docker &&

if docker-compose ps | grep "system-cloud-gateway"; then
  docker-compose -f /opt/api-center-cloud/docker/docker-compose.yml down
  docker rmi $(docker images | grep "novel-" | awk '{print $3}')
else
  echo "The container is not running."
fi

