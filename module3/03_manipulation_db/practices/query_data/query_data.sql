use management_student;
select * 
from student;

select *
from student
where student_status=true;

select *
from subjects 
where credit<10;

SELECT S.Student_Id, S.Student_Name, C.Class_Name
FROM Student S join Class C on S.Class_Id = C.Class_ID;

SELECT S.Student_Id, S.Student_Name, C.Class_Name
FROM Student S join Class C on S.Class_Id = C.Class_ID
WHERE C.Class_Name = 'A1';

SELECT Student.Student_Id, Student.Student_Name, Subjects.Subject_Name, Mark.Mark
FROM Student  join Mark  on Student.Student_Id = Mark.Student_Id 
join Subject subjects on Mark.Subject_Id = Subjects.Subject_Id;
