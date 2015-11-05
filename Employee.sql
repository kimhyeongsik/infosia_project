create table Employee
(
 eno number primary key,
 email varchar2(100),
 name varchar2(10),
 pwd varchar2(30),
 grade number default 0
)

drop table sawon

create sequence seq_sno start with 100

drop sequence seq_sno

select seq_son.nextVal from dual

select seq_sno.currVal from dual

