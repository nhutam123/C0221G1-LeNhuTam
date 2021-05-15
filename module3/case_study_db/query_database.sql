use furuma;

-- task2
select *
from employee e
where (e.employee_name like 'h%' or  e.employee_name  like't%' or e.employee_name  like'k%') 
and length(e.employee_name)<=15 ;

 -- task3
select * 
from customer c
where (year(curdate())-year(c.birthday)>=18 and year(curdate())-year(c.birthday)<=50) 
	and (c.address='da nang' Or c.address='quang nam');
    
-- task 4
select c.customer_id, c.customer_name ,count(*) as 'so lan dat'
from customer c
	join customer_type ct on c.customer_type_id=ct.customer_type_id
    join contract co on c.customer_id =co.customer_id
--     join contract_detail cd on co.contract_id=cd.contract_id
--     join extra_services es on cd.extra_services_id=es.extra_services_id
where ct.customer_type ='platinium'
group by c.customer_id
order by count(*) desc;

-- task 5
select c.customer_id, c.customer_name, ct.customer_type,co.contract_id,
s.service_name,co.start_time,co.end_time ,sum(es.price*es.donvi+s.price)
from customer c
	left join customer_type ct on c.customer_type_id=ct.customer_type_id
    left join contract co on c.customer_id=co.customer_id
    inner join service s on co.service_id=s.service_id
    inner join contract_detail cd on co.contract_id=cd.contract_id
    inner join extra_services es on cd.extra_services_id=es.extra_services_id
group by c.customer_id;

-- task 6
select s.service_id, s.service_name,c.start_time, s.using_area, s.price,st.service_type
from service_type st
    left join service  s on st.service_type_id=s.service_type_id
    left join contract c on s.service_id = c.service_id
where  c.start_time is null ;

-- task 7
select s.service_id,s.service_name,s.using_area,s.max_customer,s.price,st.service_type
from service s
inner join contract c on s.service_id=c.service_id
inner join service_type st on s.service_type_id=st.service_type_id
where year(c.start_time)=2018 ; 

-- task 8
-- cach1
select c.customer_name
from customer c
group by c.customer_name;

-- cach 2
select distinct c.customer_name
from customer c;

-- cách 3
select c.customer_name
from customer c
union
select c.customer_name
from customer c;

-- task 9
select month(c.start_time) as monthly,(c.contract_id)as 'times'
from contract c
group by month(c.start_time)
order by month(c.start_time) ;

-- task 10
select c.contract_id,c.start_time,c.end_time,c.deposit,count(cd.contract_detail_id)
from contract c
	left join contract_detail cd on c.contract_id=cd.contract_id
group by cd.contract_id;

-- task 11
select *
from extra_services es
	join contract_detail cd on es.extra_services_id=cd.extra_services_id
    join contract co on cd.contract_id=co.contract_id
    join customer c on co.customer_id=c.customer_id
    join customer_type ct on c.customer_type_id=ct.customer_type_id
where ct.customer_type='diamond' and (c.address='vinh' or c.address='quang ngai');

-- task 12
select *
from 	
