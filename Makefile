build:
    docker build -t miku1/my_repo:env .
run:
    docker run -d -e SERVER_PORT=3000 -p 8088:3000 --rm --name env miku1/my_repo:env
# runwithvolume:
#     docker run -d -p 8080:8080 -v logs:./data --rm --name env miku1/my_repo:env
# run-dev-withvolume:
#     docker run -d -p 8080:8080 -v "C:\Users\mkarbainova\Downloads\spring.data:." -v ./target logs:./data --rm --name env miku1/my_repo:env
# deletevolume:
#     docker volume prune
stop:
    docker stop env