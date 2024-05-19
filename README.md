# spring-tests

# Extensões utilizadas no codespaces
- Docker
- Spring Boot Extension Pack
- Extension Pack for Java

# Rodando a aplicação

Executar os comandos:

- docker build -t mariadb .
- docker run --name mariadb -e MYSQL_ROOT_PASSWORD=123 -e MYSQL_DATABASE=teste -e MYSQL_USER=unicap -e MYSQL_PASSWORD=123 -p 3306:3306 -d mariadb


