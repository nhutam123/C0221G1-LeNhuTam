-- buoc 1
create database demo;
-- drop table demo.products;
-- buoc 2
create table demo.products(
id int auto_increment primary key,
product_code varchar( 50),
product_name varchar(50),
product_price int,
product_mount varchar(50),
product_description varchar(50),
product_status int
);
use demo;
insert into products 
value
(1,'td33446','keo chuoi',23,'34','ngot',1),
(2,'td33456','keo ngo',25,'34','ngot',1),
(3,'td33457','keo sau rieng',27,'34','thom',1),
(4,'td33467','keo cam',30,'34','chua',1);

-- buoc 3
alter table products add unique index id_code(product_code);

alter table products add index id_two_column(product_name,product_price);

explain select * from products;

-- buoc 4.
create view view_product as
select product_code, product_name,product_price,product_status
from products;

update  view_product v
set v.product_code ='aaa11'
where v.product_code='td33467';

insert into view_product 
value
('bb11','keo mit',40,0);

select * from view_product;

delete from view_product
where product_code='aaa11';

drop view view_product;

-- buoc 5

delimiter //
create procedure p_demo()
begin
select *
from products;
end //
delimiter ;

call p_demo();

-- add product
delimiter //
drop procedure if exists p_add_product;
create procedure P_add_product(p_product_code varchar(50), p_product_name varchar(50) , p_product_price int , p_product_amount varchar(50))
begin
insert into products(product_code,product_name,product_price,product_mount)
value (p_product_code,p_product_name,p_product_price,p_product_amount);
end //
delimiter ;
call P_add_product('aa123','keo oi',34,'ngon') ;

-- set product
delimiter //
create procedure p_set_product(in p_id int, p_product_price int )
begin 
update products p
set p.product_price=p_product_price
where p.id= p_id;
end //
delimiter ;

call p_set_product(1,3);
call p_demo();

-- delete product
delimiter //
create procedure p_delete( id int)
begin 
delete from products p
where p.id=id;
end //
delimiter ;

call p_delete(1);
call p_demo();




