# 1731. 每位经理的下属员工数量

SELECT e1.employee_id, e1.name, COUNT(1) AS reports_count, ROUND( AVG(e2.age), 0) AS average_age
FROM Employees e1
INNER JOIN Employees e2 ON e1.employee_id = e2.reports_to
GROUP BY e1.employee_id
ORDER BY e1.employee_id