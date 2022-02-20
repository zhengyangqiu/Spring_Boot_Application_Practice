# Spring_Boot_Application_Practice
This is springBoot practice  project connect docker postgres database

HOW TO RUN THE PROGRAMME:

1.open the terminal and download the docker
2.run docker run --name postgres-spring -e POSTGRES_PASSWORD=password -d -p 5432:5432_postgres:alpine in terminal
3.docker ps
4.docker port postgres-spring
4.docker exec -it (portnumber) bin/bash
5.psql
6.psql -U postgres
7.CREATE DATABSE demodb
8.\c demodb
9.CREATE EXTENSION "uuid-ossp";
10.INSERT INTO person (id,name)VALUES(uuid_generate_v4(),'Maria Jones');
11.INSERT INTO person (id,name)VALUES(uuid_generate_v4(),'Tom Smith');







