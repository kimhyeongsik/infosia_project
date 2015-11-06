create table worktime
(
 eno int references employee(eno) on delete cascade not null,
 regdate char(10),
 div varchar2(10),
 regtime char(5)
 )
 
 drop table worktime
 
 