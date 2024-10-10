SELECT PRODUCT_CODE, SUM(SALES_AMOUNT * PRICE) AS SALES 
FROM PRODUCT P
JOIN OFFLINE_SALE O ON P.PRODUCT_ID = O.PRODUCT_ID
GROUP BY 1
ORDER BY 2 DESC, 1;