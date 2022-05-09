-- INITIALIZING requests TABLE 

CREATE TABLE requests (
  id Integer PRIMARY KEY,
  employee_id Integer,
  request_amount Money,
  request_reason varchar(300),
  approval_status boolean,
  bill_status boolean
);

select * from requests;

DROP TABLE requests;


-- Inserting requests data

-- Driver = 10: Jennifer Lopex
INSERT INTO requests (id, employee_id, request_amount, request_reason, approval_status, bill_status)
VALUES (1, 10, 220, 'Commuted to downtown LA for business meetings', true, false);
INSERT INTO requests (id, employee_id, request_amount, request_reason, approval_status, bill_status)
VALUES (2, 10, 125, 'Commuted to Long Beach for business meetings', false, false);
INSERT INTO requests (id, employee_id, request_amount, request_reason, approval_status, bill_status)
VALUES (3, 10, 40, 'Quick trip to the local flea markets for ... business', false, false);

-- Driver = 9: Nicole Kidman
INSERT INTO requests (id, employee_id, request_amount, request_reason, approval_status, bill_status)
VALUES (4, 9, 220, 'Commuted to downtown LA for business meetings', true, true);
INSERT INTO requests (id, employee_id, request_amount, request_reason, approval_status, bill_status)
VALUES (5, 9, 60, 'Commuted to Las Vegas for executive meeting', false, false);
INSERT INTO requests (id, employee_id, request_amount, request_reason, approval_status, bill_status)
VALUES (6, 9, 100, 'Commuted to Irvine, CA for executive meetings', true, false);

-- Driver = 6: Javier Bardem
INSERT INTO requests (id, employee_id, request_amount, request_reason, approval_status, bill_status)
VALUES (7, 6, 150, 'Client stops throughout the month of January 2020', true, true);
INSERT INTO requests (id, employee_id, request_amount, request_reason, approval_status, bill_status)
VALUES (8, 6, 155, 'Client stops throughout the month of February 2020', true, true);

-- Driver = 3: Becky Ross
INSERT INTO requests (id, employee_id, request_amount, request_reason, approval_status, bill_status)
VALUES (9, 3, 40, 'Commute from home to work', true, true);
INSERT INTO requests (id, employee_id, request_amount, request_reason, approval_status, bill_status)
VALUES (10, 3, 60, 'Commute from home to work', true, true);

-- Driver = 2: Kyle Torres
INSERT INTO requests (id, employee_id, request_amount, request_reason, approval_status, bill_status)
VALUES (11, 2, 125, 'Trips to Yaamava Casino', false, false);
INSERT INTO requests (id, employee_id, request_amount, request_reason, approval_status, bill_status)
VALUES (12, 2, 125, 'Trips to Gardens Casino', false, false);

-- Driver = 1: Anthony Baraja
INSERT INTO requests (id, employee_id, request_amount, request_reason, approval_status, bill_status)
VALUES (13, 1, 40, 'One time commute to downtown for business meeting', true, true);


