use furuma;

-- task2
select *
from employee e
where (e.employee_name like 'h%' or  e.employee_name  like't%' or e.employee_name  like'k%') 
and length(e.employee_name)<15 ;

 -- task3
select * 
from customer c
where (year(curdate())-year(c.birthday)>=18 and year(curdate())-year(c.birthday)<=50) 
	and (c.address='da nang' Or c.address='quang nam');
    
-- task 4
select *
from customer c
	join 


