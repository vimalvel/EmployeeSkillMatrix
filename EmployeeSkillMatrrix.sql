create table EmployeeDetails(
Employee_Id Number primary key Not Null,
First_Name VARCHAR(10) Not Null,
Last_Name VARCHAR(10),
Gender varchar(20) not null,
DOB Date NOT NULL,
Email varchar(255) NOT NULL Unique,
Address varchar(100) NOT NULL,
Phone_Number NUMBER Not null,
Designation varchar(20) not null,
Employee_Manager varchar(20) not null,
Salary Number Not null,
Password varchar(15) not null
);
select * from employeedetails;
insert into employeedetails values(1,'vimal','sharma','male','06-01-2002','vimal45@gmail.com','vilangudi',9344067190,'appdeveloper','shanmugam',10000,'vimal');
desc employeedetails;
drop table employeedetails;

CREATE TABLE EMPLOYEE_TEST(
TEST_ID NUMBER PRIMARY KEY NOT NULL,
TEST_NAME VARCHAR(20) NOT NULL,
MAX_MARK NUMBER NOT NULL,
PASSMARK NUMBER NOT NULL,
SUBJECT VARCHAR(20)NOT NULL
);
DESC EMPLOYEE_TEST;
insert into employee_test values(10,'java',100,40,'computer');
drop table employee_test;
select * from EMPLOYEE_TEST;


CREATE TABLE Skills(
SKILL_ID NUMBER NOT NULL PRIMARY KEY,
SKILL_NAME VARCHAR(20) NOT NULL,
SKILL_TYPE VARCHAR(40) NOT NULL,
PREREQUEST VARCHAR(30) NOT NULL,
TEST_ID NUMBER NOT NULL ,
PASSMARK NUMBER NOT NULL,
EMPLOYEE_LEVEL NUMBER NOT NULL,
FOREIGN KEY(TEST_ID) REFERENCES  EMPLOYEE_TEST(TEST_ID) 
);
insert into skills values(5,'communication','technicalskill','request',10,100,50);
DESC SKILLS;
DROP TABLE SKILLS;




CREATE TABLE EXAMDETAILS(
EXAM_ID NUMBER NOT NULL PRIMARY KEY,
EXAM_DATE DATE NOT NULL,
TEST_ID NUMBER NOT NULL,
START_TIME TIMESTAMP NOT NULL,
END_TIME TIMESTAMP NOT NULL,
EXAM_MODE VARCHAR(20) NOT NULL,
TOTAL_PARTICIPATION NUMBER NOT NULL,
SUPERVICER VARCHAR(20) NOT NULL,
NUMBER_OF_PASSED NUMBER NOT NULL,
FOREIGN KEY(TEST_ID) REFERENCES  EMPLOYEE_TEST(TEST_ID)
);
DESC examdetails;
insert into examdetails values(101,'06-01-2022',10,'06-07-2022 05:00:00',current_timestamp,'online',50,'dhivakar',30);
insert into examdetails values(102,'06-01-2022',10,'06-07-2022 05:00:00',current_timestamp,'online',50,'dhivakar',30);
commit;
select * from EXAMDETAILS;
DROP TABLE EXAMDETAILS;


CREATE TABLE EMPLOYEESKILLDETAILS
(
EMPLOYEE_ID NUMBER NOT NULL,
SKILL_ID NUMBER NOT NULL,
EXAM_ID NUMBER NOT NULL,
MARK_SCORED NUMBER NOT NULL,
GRADE VARCHAR(20) NOT NULL,
PRIMARY KEY(EMPLOYEE_ID,SKILL_ID,EXAM_ID),
FOREIGN KEY (EMPLOYEE_ID) REFERENCES EMPLOYEEDETAILS (EMPLOYEE_ID),
FOREIGN KEY (SKILL_ID) REFERENCES SKILLS (SKILL_ID),
FOREIGN KEY (EXAM_ID) REFERENCES EXAMDETAILS (EXAM_ID)
);

drop table employeeskilldetails;
insert into employeeskilldetails values(1,5,100,80,'a');
select * from employeeskilldetails;

CREATE TABLE TESTEMPLOYEEDETAILS(
EXAM_ID NUMBER NOT NULL,
EMPLOYEE_ID NUMBER NOT NULL,
STATUS VARCHAR(20) NOT NULL,
PRIMARY KEY(EXAM_ID,EMPLOYEE_ID),
FOREIGN KEY (EXAM_ID) REFERENCES EXAMDETAILS(EXAM_ID),
FOREIGN KEY (EMPLOYEE_ID) REFERENCES EMPLOYEEDETAILS(EMPLOYEE_ID)
);

desc employeedetails;
insert into testemployeedetails values(100,1,'welldone');
drop table testemployeedetails;
select * from testemployeedetails;
commit;

insert into skills values(1,'java','technicalskill','request',1,40,50);
create table adminlogin(
admin_id number primary key not null,
admin_email varchar(50) not null,
password varchar(50) not null
);
desc adminlogin;
select * from adminlogin;
commit;
