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

SELECT s.user_id,
round(count(if(c.action = 'confirmed', true, null)) / count(1), 2) as confirmation_rate
FROM Signups AS s
LEFT JOIN Confirmations AS c ON s.user_id = c.user_id
GROUP BY s.user_id;

# 570. 至少有5名直接下属的经理

SELECT e1.name
FROM Employee e1
LEFT JOIN Employee e2 ON e2.managerId = e1.id
GROUP BY e1.id
HAVING count(1) > 4

# 1280. 学生们参加各科测试的次数

SELECT s.student_id, s.student_name, sub.subject_name, count(e.subject_name) as attended_exams
FROM Students s
CROSS JOIN Subjects sub
LEFT JOIN Examinations e ON s.student_id = e.student_id
AND sub.subject_name = e.subject_name
GROUP BY s.student_id, sub.subject_name
ORDER BY s.student_id, sub.subject_name

# 577. 员工奖金

SELECT e.name, b.bonus
FROM Employee e
LEFT JOIN Bonus b ON e.empId = b.empId
WHERE b.bonus < 1000
OR b.bonus IS NULL

# 1661. 每台机器的进程平均运行时间

SELECT a1.machine_id, ROUND(SUM(a2.timestamp - a1.timestamp) / COUNT(a1.process_id), 3) AS processing_time
FROM Activity a1
LEFT JOIN Activity a2 ON a1.machine_id = a2.machine_id
AND a1.process_id = a2.process_id
WHERE a1.activity_type = 'start'
AND a2.activity_type = 'end'
GROUP BY a1.machine_id