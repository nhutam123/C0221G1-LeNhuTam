create database management_score;
-- drop database management_score;
create table management_score.student(
	student_id int primary key,
    student_name varchar(50),
    student_birthday datetime,
    class varchar(50),
    gender varchar(20)
    
    );
    create table management_score.subjects(
		subject_id int primary key,
        subject_name varchar(50)
        
    );
        create table management_score.lecturer(
		lecturer_id int primary key,
        lecturer_name varchar(50),
        phonenumber varchar(20)
    );
    create table management_score.score_board(
		student_id int, foreign key(student_id) references student(student_id),
        subject_id int, foreign key(subject_id) references lecturer(lecturer_id),
        score int,
        check_day date
        
    );
    
--     alter table subjects add lecturer_id int;
--     alter table subjects add constraint fk_lecturer foreign key (lecturer_id) references lecturer(lecturer_id);
    
    