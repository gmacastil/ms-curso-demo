0. Preparación (opt)

Instalar docker Destop o docker engine
docker run -d -p 8000:8000 -p 9443:9443 --name portainer --restart=always -v /var/run/docker.sock:/var/run/docker.sock -v portainer_data:/data portainer/portainer-ce:latest


1. instalar db

docker run --name mysql -e MYSQL_ROOT_PASSWORD=123456789 -p 3306:3306 -d mysql:8.4.1


create database test;


2. crear db y tabla

CREATE DATABASE `curso`

CREATE TABLE `product` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `price` float NOT NULL,
  PRIMARY KEY (`id`)
);

3. Model