SELECT MONTH(START_DATE), CAR_ID, COUNT(HISTORY_ID) RECORDS
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY 
WHERE DATE_FORMAT(START_DATE, '%Y-%m') BETWEEN '2022-08' AND '2022-10'
AND CAR_ID IN (SELECT CAR_ID
              FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
			  WHERE DATE_FORMAT(START_DATE, '%Y-%m') BETWEEN '2022-08' AND '2022-10'
              GROUP BY 1
              HAVING COUNT(CAR_ID) >= 5)
GROUP BY 1, 2
HAVING COUNT(CAR_ID) > 0
ORDER BY 1, 2 DESC