use classicmodels ;

delimiter //
drop procedure if exists getcusbyid;
create procedure getcusbyid(in cusnum int(11))
begin 
select * from customers  where customerNumber=cusnum ;
end //
delimiter ;
call getcusbyid(175);

delimiter //
create procedure get_customers_count_by_city(
in in_city varchar(50),
out total int
)
begin 
select count(customernumber)
into total
from customers
where city =in_city;
end //
delimiter ;
call get_customers_count_by_city('Lyon',@total);
select @total;


delimiter //
create procedure set_counter(
inout counter int,
in inc int
)
begin
set counter=counter+inc;
end //
delimiter ;

set @counter=1;
call set_counter(@counter,1);
call set_counter(@counter,1);
call set_counter(@counter,5);
select @counter;