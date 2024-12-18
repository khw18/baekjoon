SELECT E.EMP_NO, E.EMP_NAME, 
(CASE
 	WHEN SUM(SCORE)/2 >= 96 THEN 'S'
 	WHEN SUM(SCORE)/2 >= 90 THEN 'A'
 	WHEN SUM(SCORE)/2 >= 80 THEN 'B'
 	ELSE 'C'
 END) AS GRADE,
 (CASE
 	WHEN SUM(SCORE)/2 >= 96 THEN SAL * (20/100)
 	WHEN SUM(SCORE)/2 >= 90 THEN SAL * (15/100)
 	WHEN SUM(SCORE)/2 >= 80 THEN SAL * (10/100)
 	ELSE 0
 END) AS BONUS
FROM HR_DEPARTMENT D
JOIN HR_EMPLOYEES E ON D.DEPT_ID = E.DEPT_ID
JOIN HR_GRADE G ON E.EMP_NO = G.EMP_NO
GROUP BY E.EMP_NO
ORDER BY 1