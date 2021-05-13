create database management_student;
create table management_student.class(
	class_id int auto_increment primary key,
    class_name varchar(50) not null,
    start_date datetime not null,
    class_status bit
);
create table management_student.student(
	student_id int auto_increment primary key,
    student_name varchar(30) not null,
    address varchar(50),
    phone varchar(20),
    student_status bit,
    class_id  int not null , foreign key(class_id) references class(class_id)
);
create table management_student.subjects(
	subject_id int auto_increment primary key,
    subject_name varchar(30) not null,
    credit tinyint not null default 1 check (credit>=1) ,
    subject_status bit default 1

);
create table management_student.mark(
	mark_id int auto_increment primary key,
    subject_id int , foreign key(subject_id) references subjects(subject_id),
    student_id int , foreign key(student_id) references student(student_id),
    mark float default 0 check (mark between 0 and 100),
    Exam_times tinyint default 1
);
