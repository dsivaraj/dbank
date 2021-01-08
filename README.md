# dbank
git@github.com:dsivaraj/dbank.git
docker build -f dbank.Dockerfile -t dbank .
docker run -p 8080:8080 dbank:latest
