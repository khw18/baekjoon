SELECT C.CAR_ID, C.CAR_TYPE, (DAILY_FEE * DISCOUNT_RATE * 30) AS FEE
FROM CAR_RENTAL_COMPANY_CAR C
JOIN CAR_RENTAL_COMPANY_RENTAL_HISTORY H ON C.CAR_ID = H.CAR_ID
JOIN CAR_RENTAL_COMPANY_DISCOUNT_PLAN P ON C.CAR_TYPE = P.CAR_TYPE
WHERE C.CAR_TYPE IN ('세단', 'SUV') 
AND (END_DATE < '2022-11-01' 
    OR START_DATE > '2022-11-30')
AND DURATION_TYPE LIKE '30%'
ORDER BY 3 DESC, 2, 1 DESC