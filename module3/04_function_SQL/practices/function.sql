use management_student;

select s.address, count(student_id) as 'number of student'
from student s
group by address ;

select s.student_name, avg(m.mark)
from student s
join mark m on s.student_id=m.student_id
group by s.student_id;

select s.student_id , s.student_name, avg(m.mark) as 'average_mark'
from student s join mark m on s.student_id =m.student_id
group by s.student_id
having average_mark >=10;

select s.student_id , avg(m.mark) as average_mark
from student s join mark m on s.student_id=m.student_id
group by s.student_id
having average_mark >= all (select avg(m.mark) from mark group by mark.student_id )