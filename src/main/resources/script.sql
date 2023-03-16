SELECT product_name, date, amount FROM netology.ORDERS
INNER JOIN netology.CUSTOMERS on orders.customer_id = netology.CUSTOMERS.id where lower(name)~~lower(:name);