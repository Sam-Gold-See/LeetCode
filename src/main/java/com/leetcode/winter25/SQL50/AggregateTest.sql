# 620. 有趣的电影

SELECT id, movie, description, rating
FROM cinema
WHERE description != 'boring'
AND MOD(id, 2) = 1
ORDER BY rating DESC

# 1251. 平均售价

SELECT p.product_id, IFNULL(ROUND(SUM(p.price * u.units) / SUM(u.units), 2), 0) as average_price
FROM Prices p
LEFT JOIN UnitsSold u ON p.product_id = u.product_id
AND u.purchase_date BETWEEN p.start_date AND p.end_date
GROUP BY p.product_id

# 1075. 项目员工 I

SELECT p.project_id, ROUND(AVG(e.experience_years), 2) AS average_years
FROM project p
LEFT JOIN Employee e ON p.employee_id = e.employee_id
GROUP BY p.project_id

# 1633. 各赛事的用户注册率

SELECT r.contest_id, ROUND(COUNT(r.user_id)/(SELECT COUNT(1) FROM Users) * 100,2) AS percentage
FROM Register r
LEFT JOIN Users u ON r.user_id = u.user_id
GROUP BY r.contest_id
ORDER BY percentage DESC, contest_id ASC

# 1211. 查询结果的质量和占比

SELECT q.query_name,ROUND(SUM(q.rating / q.position) / COUNT(1), 2) AS quality, ROUND(SUM(IF(q.rating < 3, 1, 0)) / COUNT(1) * 100, 2) AS poor_query_percentage
FROM Queries q
GROUP BY q.query_name

# 1193. 每月交易 I

SELECT DATE_FORMAT(trans_date, '%Y-%m') AS month,
country,
COUNT(1) AS trans_count,
SUM(IF(state = 'approved', 1, 0)) AS approved_count,
SUM(amount) AS trans_total_amount,
SUM(IF(state = 'approved', amount, 0)) AS approved_total_amount
FROM Transactions
GROUP BY month, country

# 1174. 即时食物配送 II

SELECT ROUND(SUM(order_date = customer_pref_delivery_date) * 100 / COUNT(1), 2) AS immediate_percentage
FROM Delivery
WHERE (customer_id, order_date) IN (
    SELECT customer_id, min(order_date)
    FROM Delivery
    GROUP BY customer_id
)

# 550. 游戏玩法分析 IV

SELECT ROUND(AVG(a.event_date IS NOT NULL), 2) AS fraction
FROM
(SELECT player_id, MIN(event_date) AS login
FROM Activity
GROUP BY player_id) first
LEFT JOIN Activity a
ON first.player_id = a.player_id
AND DATEDIFF(a.event_date, first.login) = 1