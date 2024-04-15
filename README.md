# 운영체제 공부

## [1] [소켓 통신 by Java](https://github.com/scottXchoo/os-study/tree/main/java-socket)

## [2] [Docker 공부](https://github.com/scottXchoo/os-study/tree/main/docker-practice)
### [Docker Hub](https://hub.docker.com/r/scottxchoo/first-docker)
### 도커 명령어
- `docker build -f Dockerfile -t first-docker .` : Dockerfile을 사용해 first-docker라는 이름으로 이미지를 생성한다.
- `docker images` : 현재 갖고 있는 image 리스트 보여준다.
- `docker run -d -p 8080:8080 first-docker` : first-docker 이미지를 실행한다. (-d : 백그라운드 실행, -p : 포트 매핑)
- `docker ps` : 현재 실행중인 컨테이너 리스트를 보여준다.
- `docker stop [container id]` : 컨테이너를 중지한다.
- `docker rm [container id]` : 컨테이너를 삭제한다.
- `docker rmi [image id]` : 이미지를 삭제한다.
- `docker logs [container id]` : 컨테이너 로그를 보여준다.
- `docker login` : 도커 허브에 로그인한다.
- `docker tag [image id] [docker id]/[repository name]:[tag]` : 이미지에 태그를 붙인다.
- `docker push [docker id]/[repository name]:[tag]` : 이미지를 도커 허브에 업로드한다.
