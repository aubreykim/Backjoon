-- 코드를 입력하세요 substr (address, (o,o)=ooo)
SELECT factory_id, factory_name, address
from food_factory
where substr (address, 0,3) = '강원도'
order by factory_id
;