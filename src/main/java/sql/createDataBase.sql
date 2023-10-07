CREATE DATABASE clinic;

USE clinic;

CREATE TABLE office(
Id int(10) NOT NULL AUTO_INCREMENT,
Office varchar(60) NOT NULL,
PRIMARY KEY(Id),
UNIQUE INDEX (Office)
);

CREATE TABLE employee (
Id int(60) NOT NULL AUTO_INCREMENT,
Name varchar(60) NOT NULL,
OfficeName varchar(60) NOT NULL,
Salary varchar(100) NOT NULL,
PRIMARY KEY(Id),
FOREIGN KEY(OfficeName) REFERENCES office(Office)
);

INSERT INTO office(Office) VALUES
('Clínico Geral'),
('Pediatra'),
('Ortopedista'),
('Enfermeiro'),
('Técnico de Enfermagem'),
('Médico Terceirizado');
