CREATE DATABASE messages;

USE messages;


CREATE TABLE users (
    id int  NOT NULL,
    login varchar(255),
    password varchar(255),
    email varchar(255),
    PRIMARY KEY (ID)
);


INSERT INTO users (id, login, password, email)
VALUES (1, 'mylogin', 'password', 'exampl@gmail.com');
