# 백분율 => 비율 * 100. 비율 => 해당/전체 
WITH R AS 
(
SELECT ID, RANK() OVER (ORDER BY SIZE_OF_COLONY DESC) / COUNT(*) OVER() * 100 AS T
FROM ECOLI_DATA
)

SELECT ID, 
(
    CASE
    WHEN T <= 25 THEN "CRITICAL"
    WHEN T <= 50 THEN "HIGH"
    WHEN T <= 75 THEN "MEDIUM"
    WHEN T <= 100 THEN "LOW"
    END
) AS COLONY_NAME
FROM R
ORDER BY 1
