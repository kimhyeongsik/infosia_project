create table Employee
(
 eno number primary key,
 email varchar2(100),
 name varchar2(10),
 pwd varchar2(30),
 grade number default 0
)

insert into employee(eno,email,name, pwd) 
values(seq_eno.nextVal,'kimsh@infosiatec.com','±èÇü½Ä','1234')

select * from employee

select * from
EMPLOYEE
where email='kimsh@infosiatec.com' and pwd='1234' and grade=0

drop table sawon

create sequence seq_eno start with 100

drop sequence seq_sno

select seq_son.nextVal from dual

select seq_sno.currVal from dual

