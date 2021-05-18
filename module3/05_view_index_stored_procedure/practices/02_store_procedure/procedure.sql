use classicmodels;

delimiter //
create procedure fileallcustomers()
begin
select * from customers;
end //
delimiter ;

call fileallcustomers();

delimiter //
drop procedure if exists fileallcustomers //
create procedure fileallcustomers()
begin 
select * from customers ;
end //
delimiter ;

call fileallcustomers();
