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
