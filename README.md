# Spring Boot simple CRUD

This is a simple CRUD for User entity using Spring Boot framework, MariaDB and Docker.

This simple project code a model, repository, service, exception and controller modules to make the CRUD.

It is possible to run this repository using Github Codespaces following the simple tutorial below.

# Extensions for codespaces 

First, it is necessary to install the following extensions:

- Docker
- Spring Boot Extension Pack
- Extension Pack for Java

# Running application

Then, just run the docker:

- docker build -t mariadb .
- docker run --name mariadb -e MYSQL_ROOT_PASSWORD=123 -e MYSQL_DATABASE=teste -e MYSQL_USER=unicap -e MYSQL_PASSWORD=123 -p 3306:3306 -d mariadb

Finally, just run the file 'DemoApplication.java' located at 'app/src/main/java/com/poo/aula/demo/controller/UserController.java'

# Todo

- [ ] delete object by id (CRUD operation at controller)
- [ ] update field by id (CRUD operation at controller)
- [ ] up the Spring Boot application at Docker
