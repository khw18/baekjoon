SELECT DATE_FORMAT(SALES_DATE, "%Y") AS YEAR, DATE_FORMAT(SALES_DATE, "%m") AS MONTH, COUNT(DISTINCT U.USER_ID) AS PURCHASED_USERS, ROUND(COUNT(DISTINCT U.USER_ID) /
(SELECT COUNT(*)
 FROM USER_INFO
 WHERE DATE_FORMAT(JOINED, "%Y") = "2021"
),1) AS PUCHASED_RATIO
FROM USER_INFO U
JOIN ONLINE_SALE O ON U.USER_ID = O.USER_ID
WHERE DATE_FORMAT(JOINED, "%Y") = "2021"
GROUP BY 1, 2
ORDER BY 1, 2