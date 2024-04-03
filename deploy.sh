DIR=$(dirname "$(readlink -f "$0")")

docker build -f "$DIR"/Dockerfile -t routing-assets-example:latest . && \
 docker compose -f "$DIR"/docker-compose.yml up -d --no-deps --build --remove-orphans && \
 docker logs -f routing-assets-example
