select * from WORKTIME

insert into WORKTIME values(101,'2015/10/07','Ãâ±Ù','09:00')
insert into WORKTIME values(101,'2015/10/07','Åð±Ù','18:00')

select * from
(
select w1.eno, w1.regdate, w1.div inwork, w1.regtime intime, 
w2.div outwork, w2.regtime outtime
from (select * from WORKTIME where div='Ãâ±Ù') w1 
inner join
(select * from WORKTIME where div='Åð±Ù') w2
on w1.eno = w2.eno and w1.regdate = w2.regdate
)
where 
to_char(add_months(regdate,0), 'yyyy/mm/dd')
between 
'2015/10/01' and '2015/11/30'
order by regdate

create view worktime_view
as 
select w1.eno, w1.regdate, w1.div inwork, w1.regtime intime, 
w2.div outwork, w2.regtime outtime
from (select * from WORKTIME where div='Ãâ±Ù') w1 
inner join
(select * from WORKTIME where div='Åð±Ù') w2
on w1.eno = w2.eno and w1.regdate = w2.regdate


select * from (select * from worktime_view where eno=101)
where 
to_char(add_months(regdate,0), 'yyyy/mm/dd')
between 
'2015/11/01' and '2015/11/30'
order by regdate





select to_char(add_months('2015/11/07',0), 'yyyy/mm') from dual  

insert into employee(eno,email,name, pwd) 
values(seq_eno.nextVal,'honghs@infosiatec.com','È«È£½Ä','1234')