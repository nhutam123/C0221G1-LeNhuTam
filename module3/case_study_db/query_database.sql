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
select  co.contract_id, e.employee_name, c.customer_name, c.phone_number,
		s.service_name, cd.number_contract, co.deposit
from contract co
	join employee e on co.employee_id= e.employee_id
    join customer c on co.customer_id =c.customer_id
    join service s on co.service_id =s.service_id
    join contract_detail cd on co.contract_id=cd.contract_id
    join extra_services es on cd.extra_services_id=es.extra_services_id
where year(co.start_time) =2019 and month(co.start_time) in (1,2,3) ;

-- task 13
select * ,count(*)
from contract_detail cd
	join contract co on cd.contract_id=co.contract_id
    join extra_services es on cd.extra_services_id=es.extra_services_id
    group by es.extra_services_name
    having count(*) >= all (
		select count(*) 
		from contract_detail cd
		join contract co on cd.contract_id=co.contract_id
		join extra_services es on cd.extra_services_id=es.extra_services_id
		group by es.extra_services_name);

-- task 14
select co.contract_id, st.service_type, s.service_name ,es.extra_services_name , count(*)
from contract co 
join service s on co.service_id= s.service_id
join service_type st on s.service_type_id=st.service_type_id
join contract_detail cd on co.contract_id=cd.contract_detail_id
join extra_services es on cd.extra_services_id=es.extra_services_id
group by es.extra_services_id
having count(*)=1 ;

-- task 15
select  e.employee_id, e.employee_name,de.degree,d.department,
		e.phone_number,e.address,count(*)
from employee e
	left join contract co on e.employee_id=co.employee_id
	join degree de on e.degree_id=de.degree_id
    join department d on e.department_id=d.department_id
    join position_employee pe on e.position_id=pe.position_id
group by e.employee_id
having count(*)<=3;

-- task 16 
delete from employee e
where e.employee_id in (select tmp.id from (
	select  e.employee_id as id
	from employee e left join contract co on e.employee_id=co.employee_id
	where co.contract_id is null) as tmp );

-- task 17
update customer
set customer.customer_type_id=1
where customer.customer_type_id=2;

-- task 18
ALTER TABLE contract DROP FOREIGN KEY contract_ibfk_2;
delete from customer  c
where c.customer_id in ( select tmp.customer_id from (
	select c.customer_id
    from customer c
    join contract co on c.customer_id=co.customer_id
    where year(co.start_time) < 2016  )as tmp) ;
select* from contract;
    
-- task 19
update extra_services es
set es.price = es.price*2
where es.extra_services_id = ( select tmp.extra_services_id from (select co.contract_id ,es.extra_services_id, count(*) as times
		from contract co 
        join contract_detail dt on co.contract_id=dt.contract_id
        join extra_services es on dt.extra_services_id=es.extra_services_id
        group by es.extra_services_id
        having times >10) as tmp ) ;

-- task 20
select e.employee_id, e.employee_name,e.email,e.phone_number,e.address
from employee e 
	left join contract co on e.employee_id=co.employee_id
union 
select c.customer_id, c.customer_name,c.email,c.phone_number,c.address
from customer c
    left join contract co on c.customer_id=co.customer_id;

    