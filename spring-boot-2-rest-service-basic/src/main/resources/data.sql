--insert into Student
--values(10001,'Ranga', 'E1234567');
--
--insert into Student
--values(10002,'Ravi', 'A1234568');

DROP TABLE teacher;
DROP TABLE student;
CREATE TABLE teacher (
      teacher_id decimal PRIMARY KEY,
      name  varchar(255),
      salary decimal
 );

CREATE TABLE student (
    id decimal primary key,
    name varchar(255),
    teacher_id decimal,
    foreign key(teacher_id) REFERENCES teacher(teacher_id));


