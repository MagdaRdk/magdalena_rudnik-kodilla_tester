SELECT USER_ID, COUNT(*) AS POSTS_NUMBER
FROM POSTS
GROUP BY USER_ID;
