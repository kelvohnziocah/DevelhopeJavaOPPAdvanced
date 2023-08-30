#CREATE DATABASE ticketing_system;
use ticketing_system;
CREATE TABLE department (
department_id INT, 
department_name VARCHAR(255), 
department_description VARCHAR(255), 
department_director INT, 
created_on TIMESTAMP, 
created_by INT, 
updated_on TIMESTAMP, 
updated_by INT,
foreign key (department_director) references users(user_id),
primary key (department_id));

CREATE TABLE ticketing_users(
    user_id INT,
    first_name VARCHAR(255),
    surname VARCHAR(255),
    email VARCHAR (255),
    password VARCHAR(255),
    position_id INT,
    role_id INT,
    created_by INT,
    created_on TIMESTAMP,
    updated_by INT,
    updated_on TIMESTAMP,
    PRIMARY KEY(user_id));
    
CREATE TABLE role (
role_id INT, 
role_name VARCHAR(255), 
created_on TIMESTAMP, 
created_by INT, 
updated_on TIMESTAMP, 
updated_by INT,
PRIMARY KEY (role_id));

CREATE TABLE position (
position_id INT,
position_name VARCHAR(255),
department_id INT, 
created_on TIMESTAMP,
created_by  INT,
updated_on TIMESTAMP,
updated_by INT,  
Foreign Key (department_id) references department(department_id),
PRIMARY KEY (position_id));