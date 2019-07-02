# spring_boot_mysql
Tutorial von Spring Boot mit MySql

Links: 
https://www.youtube.com/watch?v=QloyS2dt9T4 <br/>
https://www.codejava.net/frameworks/spring-boot/spring-boot-crud-example-with-spring-mvc-spring-data-jpa-thymeleaf-hibernate-mysql <br/>

Datenbank SQL:<br/>
CREATE TABLE `auto` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `model` varchar(45) NOT NULL,
  `marke` varchar(45) NOT NULL,
  `herstellungsland` varchar(45) NOT NULL,
  `preis` float NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
