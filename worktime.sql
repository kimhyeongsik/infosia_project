create table timetable
(
 sno int references sawon(sno) on delete cascade not null,
 div varchar2(10),
 regtime date,
 regdate date
 )
 
 