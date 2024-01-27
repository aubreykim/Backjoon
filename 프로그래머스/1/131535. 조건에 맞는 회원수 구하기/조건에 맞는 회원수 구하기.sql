-- 코드를 입력하세요
SELECT count(*)
FROM USER_INFO
where to_char(joined, 'yyyy') = '2021'
and age between 20 and 29
;