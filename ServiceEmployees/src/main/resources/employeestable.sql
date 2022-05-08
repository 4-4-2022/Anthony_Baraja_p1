-- INITIALIZING employees TABLE 

CREATE TABLE employees (
  id integer PRIMARY KEY,
  fname varchar(20),
  lname varchar(20),
  job_role text
);

select * from employees;

DROP TABLE employees;


-- Inserting employees data

INSERT INTO employees (id, fname, lname, job_role)
VALUES (1, 'Anthony', 'Baraja', 'Admin');
INSERT INTO employees (id, fname, lname, job_role)
VALUES (2, 'Kyle', 'Torres', 'Driver');
INSERT INTO employees (id, fname, lname, job_role)
VALUES (3, 'Becky', 'Ross', 'Driver');
INSERT INTO employees (id, fname, lname, job_role)
VALUES (4, 'Stone', 'Cold', 'Manager');
INSERT INTO employees (id, fname, lname, job_role)
VALUES (5, 'Andrew', 'Garfield', 'Manager');
INSERT INTO employees (id, fname, lname, job_role)
VALUES (6, 'Javier', 'Bardem', 'Driver');
INSERT INTO employees (id, fname, lname, job_role)
VALUES (7, 'Denzel', 'Washington', 'Manager');
INSERT INTO employees (id, fname, lname, job_role)
VALUES (8, 'Jessica', 'Chastain', 'Admin');
INSERT INTO employees (id, fname, lname, job_role)
VALUES (9, 'Nicole', 'Kidman', 'Driver');
INSERT INTO employees (id, fname, lname, job_role)
VALUES (10, 'Jennifer', 'Lopez', 'Driver');

