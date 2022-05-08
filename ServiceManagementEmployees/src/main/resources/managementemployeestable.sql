-- INITIALIZING managementEmployees TABLE 

CREATE TABLE managementEmployees (
  id integer PRIMARY KEY,
  managerFName varchar(20),
  managerLName varchar(20),
  employeeFName varchar(20),
  employeeLName varchar(20)
  
);

select * from managementEmployees;

DROP TABLE managementEmployees;


-- Inserting managementEmployees data

-- Manager = Denzel Washington
INSERT INTO managementEmployees (id, managerFName, managerLName, employeeFName, employeeLName)
VALUES (1, 'Denzel', 'Washington', 'Anthony', 'Baraja');
INSERT INTO managementEmployees (id, managerFName, managerLName, employeeFName, employeeLName)
VALUES (2, 'Denzel', 'Washington', 'Jessica', 'Chastain');
-- Manager = Stone Cold
INSERT INTO managementEmployees (id, managerFName, managerLName, employeeFName, employeeLName)
VALUES (3, 'Stone', 'Cold', 'Becky', 'Ross');
INSERT INTO managementEmployees (id, managerFName, managerLName, employeeFName, employeeLName)
VALUES (4, 'Stone', 'Cold', 'Nicole', 'Kidman');
-- Manager = Andrew Garfield
INSERT INTO managementEmployees (id, managerFName, managerLName, employeeFName, employeeLName)
VALUES (5, 'Andrew', 'Garfield', 'Kyle', 'Torres');
INSERT INTO managementEmployees (id, managerFName, managerLName, employeeFName, employeeLName)
VALUES (6, 'Andrew', 'Garfield', 'Javier', 'Bardem');
INSERT INTO managementEmployees (id, managerFName, managerLName, employeeFName, employeeLName)
VALUES (7, 'Andrew', 'Garfield', 'Jennifer', 'Lopez');


