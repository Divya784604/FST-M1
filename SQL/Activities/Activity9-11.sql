CREATE TABLE customers (
    customer_id INT PRIMARY KEY,
    customer_name VARCHAR2(32),
    city VARCHAR2(20),
    grade INT,
    salesman_id INT
);
INSERT ALL
    INTO customers VALUES (3002, 'Nick Rimando', 'New York', 100, 5001)
    INTO customers VALUES (3007, 'Brad Davis', 'New York', 200, 5001)
    INTO customers VALUES (3005, 'Graham Zusi', 'California', 200, 5002)
    INTO customers VALUES (3008, 'Julian Green', 'London', 300, 5002)
    INTO customers VALUES (3004, 'Fabian Johnson', 'Paris', 300, 5006)
    INTO customers VALUES (3009, 'Geoff Cameron', 'Berlin', 100, 5003)
    INTO customers VALUES (3003, 'Jozy Altidor', 'Moscow', 200, 5007)
    INTO customers VALUES (3001, 'Brad Guzan', 'London', 300, 5005)
SELECT 1 FROM DUAL;

SELECT * 
FROM orders 
WHERE salesman_id = (
    SELECT salesman_id 
    FROM customers 
    WHERE customer_id = 3007
);
SELECT * 
FROM orders 
WHERE salesman_id IN (
    SELECT salesman_id 
    FROM salesman 
    WHERE salesman_city = 'New York'
);
SELECT COUNT(*) AS high_grade_customers 
FROM customers 
WHERE grade > (
    SELECT AVG(grade) 
    FROM customers 
    WHERE city = 'New York'
);
SELECT * 
FROM orders 
WHERE salesman_id IN (
    SELECT salesman_id 
    FROM salesman 
    WHERE commission = (
        SELECT MAX(commission) 
        FROM salesman
    )
);

-- Combined results of salesmen and customers with more than one order
SELECT salesman_id AS id, salesman_name AS name
FROM salesman s
WHERE (SELECT COUNT(*) FROM orders o WHERE o.salesman_id = s.salesman_id) > 1

UNION

SELECT customer_id AS id, customer_name AS name
FROM customers c
WHERE (SELECT COUNT(*) FROM orders o WHERE o.customer_id = c.customer_id) > 1

ORDER BY name;
SELECT 
    o.order_date,
    s.salesman_name,
    o.purchase_amount,
    CASE 
        WHEN o.purchase_amount = (
            SELECT MAX(o2.purchase_amount)
            FROM orders o2
            WHERE o2.order_date = o.order_date
        ) THEN 'highest on'
        ELSE 'lowest on'
    END AS order_type
FROM orders o
JOIN salesman s ON o.salesman_id = s.salesman_id
WHERE o.purchase_amount = (
        SELECT MAX(o3.purchase_amount)
        FROM orders o3
        WHERE o3.order_date = o.order_date
    )
   OR o.purchase_amount = (
        SELECT MIN(o4.purchase_amount)
        FROM orders o4
        WHERE o4.order_date = o.order_date
    )
ORDER BY o.order_date;
