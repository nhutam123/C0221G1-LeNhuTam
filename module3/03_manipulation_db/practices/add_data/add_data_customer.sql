use manage_customer;

select * from customer;

insert into customer
value(1,'minh quan',10);
insert into customer
value(2,'ngoc oanh',20);
insert into customer
value(3,'hong ha',50);

select * from customer_order;
insert into customer_order (order_id,customer_id,order_date)
values (1,1,'2006-3-21');
insert into customer_order (order_id,customer_id,order_date)
values (2,2,'2006-3-23');
insert into customer_order (order_id,customer_id,order_date)
values (3,1,'2006-3-16');

select * from product;
insert into product
values (1,'may giat',3);
insert into product
values (2,'tu lanh',5);
insert into product
values (3,'dieu hoa',7);
insert into product
values (4,'quat',1);
insert into product
values (5,'bep dien',2);

select * from order_detail;
-- delete from order_detail;
insert into order_detail
values (1,1,3);
insert into order_detail
values (1,3,7);
insert into order_detail
values (1,4,3);
insert into order_detail
values (2,1,1);
insert into order_detail
values (3,1,8);
insert into order_detail
values (2,5,4);
insert into order_detail
values (2,3,3);

