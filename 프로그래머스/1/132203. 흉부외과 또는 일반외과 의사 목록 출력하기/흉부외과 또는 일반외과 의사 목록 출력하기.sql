-- 코드를 입력하세요
SELECT dr_name, dr_id, mcdp_cd, to_char(hire_ymd, 'YYYY-MM-DD') 
from doctor
where mcdp_cd ='GS' or MCDP_cd = 'CS'
order by hire_ymd desc, dr_name;