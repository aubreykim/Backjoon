-- 코드를 입력하세요 select from where order by to_char
SELECT a.title, a.board_id, b.reply_id, b.writer_id, b.contents, to_char(b.created_date, 'yyyy-MM-dd')
from  USED_GOODS_BOARD a, USED_GOODS_REPLY b
where a.BOARD_ID = b.BOARD_ID
and to_char(a.created_date, 'yyyyMM') = '202210'
order by b.created_date, a.title
;