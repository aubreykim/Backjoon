-- 코드를 입력하세요
SELECT FACTORY_ID, FACTORY_NAME, ADDRESS
FROM FOOD_FACTORY
WHERE SUBSTR(TLNO, 1, 3) = '033'
ORDER BY FACTORY_ID ASC
;