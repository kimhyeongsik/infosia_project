create table worktime
(
 eno int references employee(eno) on delete cascade not null,
 regdate date,
 div varchar2(10),
 regtime date
 )
 
 