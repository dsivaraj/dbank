# dbank
git@github.com:dsivaraj/dbank.git
docker build -f dbank.Dockerfile -t dbank .
docker run -p 8080:8080 dbank:latest
https://github.com/jonashackt/spring-boot-rest-clientcertificate