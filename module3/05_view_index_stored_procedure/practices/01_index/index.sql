use classicmodels;

explain select * from customers 
where customerName ='Land of Toys Inc.';

alter table customers add index idx_customername(customername);
explain select * from customers where customername='Land of Toys Inc.';

alter table customers add index idx_fullname(contactfirstname ,contactlastname);
explain select * from customers where contactfirstname ='Jean' or contactFirstName = 'King';

alter table customers drop index idx_fullname;