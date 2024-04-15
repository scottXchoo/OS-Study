# 명령어 하나하나가 레이어이다.
# 최상단 레이어부터 실행되는데, 변경되지 않은 레이어는 캐시를 이용해 재사용하여 효율적이다.

# 베이스 이미지로 시작한다.
FROM node:16-alpine

# 컨테이너 안에 어떤 경로를 실행할지 설정한다.
# WORKDIR은 RUN, CMD, ENTRYPOINT, COPY, ADD 명령어가 실행될 디렉토리를 설정한다. (= cd)
WORKDIR /app

# 가장 변동이 적은 순서대로 copy한다.
COPY package.json package-lock.json ./

# npm install : 최신 버전을 받게 된다.
# npm ci : package-lock.json에 명시된 버전을 받게 된다.
RUN npm ci

COPY index.js ./

# 컨테이너를 실행할 때 사용할 명령어를 설정한다.
ENTRYPOINT [ "node", "index.js" ]

# docker build -f Dockerfile -t first-docker . : Dockerfile을 사용해 first-docker라는 이름으로 이미지를 생성한다.
# docker images : 현재 갖고 있는 image 리스트 보여준다.
# docker run -d -p 8080:8080 first-docker : first-docker 이미지를 실행한다. (-d : 백그라운드 실행, -p : 포트 매핑)
# docker ps : 현재 실행중인 컨테이너 리스트를 보여준다.
# docker stop [container id] : 컨테이너를 중지한다.
# docker rm [container id] : 컨테이너를 삭제한다.
# docker rmi [image id] : 이미지를 삭제한다.
# docker logs [container id] : 컨테이너 로그를 보여준다.
# docker login : 도커 허브에 로그인한다.
# docker tag [image id] [docker id]/[repository name]:[tag] : 이미지에 태그를 붙인다.
# docker push [docker id]/[repository name]:[tag] : 이미지를 도커 허브에 업로드한다.