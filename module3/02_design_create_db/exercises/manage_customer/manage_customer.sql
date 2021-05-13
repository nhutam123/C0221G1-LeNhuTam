create database manage_customer;
-- drop database manage_customer;
create table manage_customer.customer(
	customer_id int auto_increment primary key,
    customer_name varchar(50) not null,
    customer_age int not null
);
create table manage_customer.customer_order(
	order_id int auto_increment primary key,
    customer_id int , foreign key(customer_id) references customer(customer_id),
    order_date datetime,
    total_price int
);
create table manage_customer.product(
	product_id int auto_increment primary key,
    product_name varchar(50),
    product_price int
);
create table manage_customer.order_detail(
	order_id int , foreign key(order_id) references customer_order(order_id),
    product_id int , foreign key(product_id) references product(product_id),
    odqty varchar(50)
);
