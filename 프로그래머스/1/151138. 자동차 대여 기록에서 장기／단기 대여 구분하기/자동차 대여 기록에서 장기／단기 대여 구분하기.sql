-- 코드를 입력하세요
SELECT history_id, car_id, to_char (start_date, 'yyyy-MM-dd') as START_DATE, to_char (end_date, 'YYYY-MM-DD') as END_DATE, case when (end_date - start_date) >= 29 then '장기 대여'
else '단기 대여' end as RENT_TYPE
from CAR_RENTAL_COMPANY_RENTAL_HISTORY 
where to_char (start_date, 'yyyy-MM-dd') like '%2022-09%'
order by history_id desc


;