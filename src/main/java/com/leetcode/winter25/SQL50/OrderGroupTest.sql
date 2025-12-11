# 2356. 每位教师所教授的科目种类的数量

SELECT teacher_id, COUNT(DISTINCT subject_id) AS cnt
FROM Teacher t
GROUP BY teacher_id;

# 1141. 查询近30天活跃用户数

SELECT activity_date AS day, COUNT(DISTINCT user_id) AS active_users
FROM Activity a
WHERE DATEDIFF('2019-07-27', activity_date) >= 0 AND DATEDIFF('2019-07-27', activity_date) < 30
GROUP BY activity_date

# 1084. 销售分析 III

SELECT p.product_id, p.product_name
FROM Sales s
LEFT JOIN Product p ON s.product_id = p.product_id
GROUP BY s.product_id
HAVING MIN(s.sale_date) >= '2019-01-01' AND MAX(s.sale_date) < '2019-03-31'

# 596. 超过 5 名学生的课

SELECT class
FROM Courses
GROUP BY class
HAVING COUNT(1) >= 5

# 1729. 求关注者的数量

SELECT user_id, COUNT(1) AS followers_count
FROM Followers
GROUP BY user_id
ORDER BY user_id

# 619. 只出现一次的最大数字

SELECT MAX(num) AS num
FROM
(SELECT num
FROM MyNumbers
GROUP BY num
HAVING COUNT(1) = 1) t;

# 1045. 买下所有产品的客户

SELECT customer_id
FROM Customer
GROUP BY customer_id
HAVING COUNT(DISTINCT product_key) =
(SELECT COUNT(1) AS cnt
FROM Product)
