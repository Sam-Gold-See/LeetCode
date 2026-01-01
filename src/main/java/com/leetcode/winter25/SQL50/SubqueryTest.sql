# 1978. 上级经理已离职的公司员工

SELECT e1.employee_id
FROM Employees e1
LEFT JOIN Employees e2 ON e1.manager_id = e2.employee_id
WHERE e1.salary < 30000
AND e1.manager_id IS NOT NULL
AND e2.employee_id IS NULL
ORDER BY e1.employee_id

# 626. 换座位

select (case
when id%2=0 then id-1
when id=(select max(id) from seat) then id
else id+1 end) as id ,student
from seat order by id;

# 1341. 电影评分

(SELECT name AS results
FROM Users u
LEFT JOIN MovieRating mr ON u.user_id = mr.user_id
GROUP BY u.user_id
ORDER BY COUNT(*) DESC, u.name ASC
LIMIT 1)
UNION ALL
(SELECT title AS results
FROM Movies m
LEFT JOIN MovieRating mr ON m.movie_id = mr.movie_id AND YEAR(mr.created_at) = 2020 AND MONTH(mr.created_at) = 2
GROUP BY mr.movie_id
ORDER BY AVG(mr.rating) DESC, title
LIMIT 1)
