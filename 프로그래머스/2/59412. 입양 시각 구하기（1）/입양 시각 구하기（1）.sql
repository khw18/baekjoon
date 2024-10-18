SET @hour := 8;

SELECT (@hour := @hour + 1) AS HOUR, (SELECT COUNT(*) AS COUNT
                             FROM ANIMAL_OUTS
                             WHERE @hour = HOUR(DATETIME)) AS COUNT
FROM ANIMAL_OUTS
WHERE @hour < 19
ORDER BY 1