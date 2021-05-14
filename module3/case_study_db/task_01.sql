drop database if exists furuma;
create database furuma;
-- drop database furuma; 
create table furuma.degree(
	degree_id INT primary key,
    degree varchar(50)
);
create table furuma.department(
	department_id INT primary key,
    department varchar(50)
);
create table furuma.position_employee(
	position_id INT primary key,
    position_name varchar(50)
);
create table furuma.employee(
	employee_id INT primary key,
	employee_name varchar(50),
	degree_id INT ,foreign key(degree_id) references degree(degree_id),
	department_id INT,foreign key(department_id) references department(department_id),
    position_id INT,foreign key(position_id) references position_employee(position_id),
	birthday date,
	identify_card_number varchar(20),
	salary varchar(45),
	phone_number varchar(15),
	Email varchar(50),
	Address varchar(45)
);
-- drop database furuma; 
create table furuma.extra_services(
	extra_services_id INT primary key,
    extra_services_name varchar(50),
    price INT,
    DonVi INT,
    `status` varchar(50)
    
);
create  table furuma.rental_type(
	rental_type_id INT primary key,
    rental_type varchar(50),
    price INT
);
create table furuma.service_type(
	service_type_id INT primary key,
    service_type varchar(50)
);
create table furuma.service(
	service_id int primary key,
    service_name varchar(50),
    using_area int,
    floor_number int,
    max_customer int,
    price int, 
    rental_type_id int, foreign key(rental_type_id) references rental_type(rental_type_id),
    service_type_id int, foreign key(service_type_id) references service_type(service_type_id),
    `status` varchar(45)
);

create table furuma.customer_type(
	customer_type_id INT primary key,
    customer_type varchar(50)
);

create table furuma.customer(
	customer_id INT primary key,
    customer_type_id INT,foreign key(customer_type_id) references customer_type(customer_type_id),
    customer_name varchar(50),
    birthday date,
    identify_card_number varchar(50),
    phone_number varchar(20),
    Email varchar(50),
    address varchar(100)
);

create table furuma.contract(
	contract_id int primary key,
    employee_id INT,foreign key(employee_id) references employee(employee_id),
    customer_id int, foreign key(customer_id) references customer(customer_id),
	service_id int,foreign key(service_id)references service(service_id),
    start_time date,
    end_time date,
    deposit int,
    total_price int
	
);

create table furuma.contract_detail(
	contract_detail_id INT primary key,
    contract_id INT,foreign key(contract_id) references contract(contract_id),
	extra_services_id INT,foreign key(extra_services_id) references extra_services(extra_services_id),
    number_contract INT
);





