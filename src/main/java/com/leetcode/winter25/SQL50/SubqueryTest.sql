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

# 1321. 餐馆营业额变化增长

SELECT a.visited_on, SUM( b.amount ) AS amount, ROUND(SUM(b.amount) / 7, 2) AS average_amount
FROM ( SELECT DISTINCT visited_on FROM customer ) a
JOIN customer b ON DATEDIFF( a.visited_on, b.visited_on ) BETWEEN 0 AND 6
WHERE a.visited_on >= (SELECT MIN(visited_on) FROM customer) + 6
GROUP BY a.visited_on
ORDER BY a.visited_on

# 602. 好友申请 II ：谁有最多的好友

SELECT id, COUNT(*) AS num
FROM (
    SELECT requester_id id FROM RequestAccepted
    UNION ALL
    SELECT accepter_id id FROM RequestAccepted
) t1
GROUP BY id
ORDER BY num DESC
LIMIT 1

# 585. 2016年的投资

SELECT ROUND(SUM(tiv_2016), 2)AS tiv_2016
FROM Insurance
WHERE tiv_2015 IN(
    SELECT tiv_2015
    FROM Insurance
    GROUP BY tiv_2015
    HAVING COUNT(1) > 1)
AND CONCAT(lat, lon) IN(
    SELECT CONCAT(lat, lon)
    FROM Insurance
    GROUP BY lat, lon
    HAVING COUNT(*) = 1
)