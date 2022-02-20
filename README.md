# Spring_Boot_Application_Practice<br />
This is springBoot practice  project connect docker postgres database<br />

HOW TO RUN THE PROGRAMME:<br />

1.open the terminal and download the docker <br />

2.run docker run --name postgres-spring -e POSTGRES_PASSWORD=password -d -p 5432:5432_postgres:alpine in terminal<br />
3.docker ps<br />
4.docker port postgres-spring<br />
4.docker exec -it (portnumber) bin/bash<br />
5.psql<br />
6.psql -U postgres<br />
7.CREATE DATABSE demodb<br />
8.\c demodb<br />
9.CREATE EXTENSION "uuid-ossp";<br />
10.INSERT INTO person (id,name)VALUES(uuid_generate_v4(),'Maria Jones');<br />
11.INSERT INTO person (id,name)VALUES(uuid_generate_v4(),'Tom Smith');<br />







