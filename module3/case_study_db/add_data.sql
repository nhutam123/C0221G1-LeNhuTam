use furuma;
select * from degree;

insert into degree
values 
(1,'trung cap'),
(2,'cao dang'),
(3,'dai hoc'),
(4,'sau dai hoc');

insert into position_employee
values
(1,'le tan'),
(2,'phuc vu'),
(3,'chuyen vien'),
(4,'giam sat'),
(5,'quan ly'),
(6,'giam doc');

 
insert into department
value
(1,'Sale – Marketing'),
(2,'Hành Chính'),
(3,'Phục vụ'),
(4,'Quản lý');

select* from employee;
insert into employee
values
(1,'le nhu tam',1,2,3,'1993/5/15',12345,15,093333333,'soledad@gmail','nguyen luong bang'),
(2,'le anh hoan',2,1,2,'1992/4/23',123467,17,098755555,'hoan@gmail','thanh thuy'),
(3,'nguyen anh tan',3,4,5,'1990/7/12',12378,5,03444444,'tan@gamil','da nang'),
(4,'huu tho',3,3,3,'1999/4/3',32455,30,038333333,'tho@gmail','quang nam');

select * from customer_type;
insert into customer_type
values 
(1,'Diamond'),
(2,'Platinium'),
(3,'Gold'),
(4,'Silver'),
(5,'Member');

select * from customer;
insert into customer
values
(1,2,'tam dep trai', '2000/12/9',334455,0995555,'tam@gmail','phu tho'),
(2,3,'tho dep trai', '1999/11/9',334467,0995444,'tho@gmail','bac ninh'),
(3,4,'thuy dep trai', '1992/3/14',334222,0995777,'thuy@gmail','quang nam'),
(4,1,'tuan dep trai', '2001/2/19',334333,0995111,'tuan@gmail','bac giang'),
(5,2,'minh dep trai', '2000/12/9',334665,0995343,'minh@gmail','sai gon');



