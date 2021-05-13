create database manage_product;
-- drop database manage_product;
create table manage_product.producer(
	producer_id int auto_increment primary key,
    producer_name varchar(50),
    address varchar(50),
    phone_number varchar(20)
);
create table manage_product.bill_out(
	bill_id int auto_increment primary key,
    bill_date date
);
create table manage_product.materials(
	material_id int auto_increment primary key,
    material_name varchar(50)
);
create table manage_product.bill_detail(
	bill_id int, foreign key(bill_id) references bill_out(bill_id),
    material_id int,foreign key(material_id) references materials(material_id),
    number_bill int,
    bill_price int,
    primary key(bill_id,material_id)
);
create table manage_product.bill_into(
	bill_into_id int auto_increment primary key,
    date_export datetime
);
create table manage_product.bill_into_detail(
	bill_into_id int ,foreign key(bill_into_id) references bill_into(bill_into_id),
    material_id int ,foreign key(material_id) references materials(material_id),
    bill_into_price int,
    number_bill int,
    primary key(bill_into_id,material_id)
);
create table manage_product.orders(
	producer_id int,foreign key(producer_id) references producer(producer_id),
	order_id int primary key,
    order_date date
);
create table manage_product.order_detail(
	material_id int, foreign key(material_id) references materials(material_id),
    order_id int, foreign key(order_id) references orders(order_id),
    primary key(material_id,order_id)
);


