# dbank
git clone git@github.com:dsivaraj/dbank.git
docker build -t dbank -f dbank.Dockerfile .
docker run  -p 8080:8080 --name dbank --rm dbank:latest
