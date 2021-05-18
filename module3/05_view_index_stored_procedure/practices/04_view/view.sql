use classicmodels;
-- create view
create view customers_view as
select customerNumber, customerName, phone
from customers;
select * from customers_view;

-- update view
create or replace view customers_view as
select customerNumber, customerName, contactFirstName, contactLastName, phone
from customers
where city='Nantes';

select * from customers_view;

-- drop view
drop view customers_view;
