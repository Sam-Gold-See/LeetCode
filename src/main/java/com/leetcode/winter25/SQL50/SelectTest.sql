# 1757. 可回收且低脂的产品

SELECT product_id FROM Products WHERE low_fats = 'Y' and recyclable = 'Y';

# 584. 寻找用户推荐人

SELECT name
FROM Customer
WHERE referee_id != 2
OR referee_id IS NULL

# 595. 大的国家

SELECT name, population, area
FROM World
WHERE area >= 3000000
OR population >= 25000000

# 1148. 文章浏览 I

SELECT DISTINCT author_id AS id
FROM Views
WHERE author_id = viewer_id
ORDER BY author_id

# 1683. 无效的推文

SELECT tweet_id
FROM Tweets
WHERE LENGTH(content) >15

# 1378. 使用唯一标识码替换员工ID

SELECT e2.unique_id, e1.name
FROM Employees e1
LEFT JOIN EmployeeUNI e2 ON e1.id = e2.id

# 1068. 产品销售分析 I

SELECT p.product_name, s.year, s.price
FROM Sales s
LEFT JOIN Product p ON s.product_id = p.product_id

# 197. 上升的温度

SELECT t.id
FROM Weather t
CROSS JOIN Weather y
WHERE DATEDIFF(t.recordDate,y.recordDate)=1
AND t.temperature > y.temperature

# 1581. 进店却未进行过交易的顾客

SELECT v.customer_id, count(1) AS count_no_trans
FROM Visits v
LEFT JOIN Transactions t ON v.visit_id = t.visit_id
WHERE t.transaction_id IS NULL
GROUP BY v.customer_id

# 1934. 确认率

# 570. 至少有5名直接下属的经理

SELECT e1.name
FROM Employee e1
LEFT JOIN Employee e2 ON e2.managerId = e1.id
GROUP BY e1.id
HAVING count(1) > 4

# 1280. 学生们参加各科测试的次数

