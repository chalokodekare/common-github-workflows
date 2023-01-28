source run/common.sh

docker run --env-file run/.envfile -d -p 8080:8080 $app:$buildTag
