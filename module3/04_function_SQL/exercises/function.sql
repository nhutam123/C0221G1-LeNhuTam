use management_student ;

-- Hiển thị tất cả các thông tin môn học (bảng subject) có credit lớn nhất.
select * 
from subjects s 
where credit >= all (select credit from subjects);

-- Hiển thị các thông tin môn học có điểm thi lớn nhất.
select s.subject_id,s.subject_name,s.credit,s.subject_status
from subjects s join mark m on s.subject_id=m.subject_id
where mark>= all (select mark from mark);

-- Hiển thị các thông tin sinh viên và điểm trung bình của mỗi sinh viên, xếp hạng theo thứ tự điểm giảm dần
select *, avg(mark) as average_mark
from student s left join mark m on s.student_id = m.student_id
group by s.student_id 
order by average_mark desc;

