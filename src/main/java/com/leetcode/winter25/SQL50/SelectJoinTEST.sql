# 1731. 每位经理的下属员工数量

SELECT e1.employee_id, e1.name, COUNT(1) AS reports_count, ROUND( AVG(e2.age), 0) AS average_age
FROM Employees e1
INNER JOIN Employees e2 ON e1.employee_id = e2.reports_to
GROUP BY e1.employee_id
ORDER BY e1.employee_id

# 1789. 员工的直属部门

SELECT employee_id, department_id
FROM Employee
WHERE primary_flag = 'Y' OR employee_id IN (
    SELECT e.employee_id
    FROM Employee e
    GROUP BY employee_id
    HAVING COUNT(1) = 1
)

# 610. 判断三角形

SELECT x, y, z,
    CASE
        WHEN x + y > z AND x + z > y AND y + z > x THEN 'Yes'
        ELSE 'No'
    END AS triangle
FROM Triangle

# 180. 连续出现的数字

SELECT DISTINCT l1.num AS ConsecutiveNums
FROM Logs l1, Logs l2, Logs l3
WHERE l1.id = l2.id - 1
AND l2.id = l3.id - 1
AND l1.num = l2.num
AND l2.num = l3.num;
