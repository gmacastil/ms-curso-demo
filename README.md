1. instalar db

docker run --name mysql -e MYSQL_ROOT_PASSWORD=123456789 -p 3306:3306 -d mysql:8.4.1


2. crear db y tabla

CREATE DATABASE `curso`

CREATE TABLE `product` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `price` float NOT NULL,
  PRIMARY KEY (`id`)
);

3. Model