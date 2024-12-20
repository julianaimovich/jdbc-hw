CREATE TABLE CUSTOMERS (
    id INT AUTO_INCREMENT UNIQUE PRIMARY KEY,
    name VARCHAR(255),
    surname VARCHAR(255),
    age INT,
    phone_number VARCHAR(20)
);

CREATE TABLE ORDERS (
    id INT AUTO_INCREMENT UNIQUE PRIMARY KEY,
    date DATE,
    customer_id INT,
    product_name VARCHAR(255),
    amount INT,
    FOREIGN KEY (customer_id) REFERENCES CUSTOMERS (id)
);