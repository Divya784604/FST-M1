CREATE TABLE salesman (
    salesman_id INT,
    salesman_name VARCHAR2(20),
    salesman_city VARCHAR2(20),
    commission INT
);

INSERT INTO salesman (salesman_id, salesman_name, salesman_city, commission) 
VALUES (5001, 'James Hoog', 'New York', 15);

INSERT INTO salesman (salesman_id, salesman_name, salesman_city, commission) 
VALUES (5002, 'Nail Knite', 'Paris', 13);

INSERT INTO salesman (salesman_id, salesman_name, salesman_city, commission) 
VALUES (5005, 'Pit Alex', 'London', 11);

INSERT INTO salesman (salesman_id, salesman_name, salesman_city, commission) 
VALUES (5006, 'McLyon', 'Paris', 14);

INSERT INTO salesman (salesman_id, salesman_name, salesman_city, commission) 
VALUES (5007, 'Paul Adam', 'Rome', 13);

INSERT INTO salesman (salesman_id, salesman_name, salesman_city, commission) 
VALUES (5003, 'Lauson Hen', 'San Jose', 12);

SELECT salesman_id, salesman_city
FROM salesman;
SELECT *
FROM salesman
WHERE salesman_city = 'Paris';
SELECT salesman_id, commission
FROM salesman
WHERE salesman_name = 'Paul Adam';

ALTER TABLE salesman
ADD grade INT;
UPDATE salesman
SET grade = 100;
SELECT * FROM salesman;

-- Update grade score of salesmen from Rome to 200
UPDATE salesman
SET grade = 200
WHERE salesman_city = 'Rome';

-- Update grade score of James Hoog to 300
UPDATE salesman
SET grade = 300
WHERE salesman_name = 'James Hoog';

-- Update name McLyon to Pierre
UPDATE salesman
SET salesman_name = 'Pierre'
WHERE salesman_name = 'McLyon';

