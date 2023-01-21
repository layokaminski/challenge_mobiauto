SELECT order_id, SUM(unit_price * quantity) AS total_price
FROM orders
JOIN order_details ON orders.order_id = order_details.id
WHERE customer_name = 'DeathStar'
GROUP BY order_id;
