use joinTest;


-- Inner Join or default join
-- get the data which are matched on both the tables based on the confitaion with "ON" colose
select emp.name as Ename, emp.id as EId, dept.name as DeptId from EMPLOYEE emp  inner join DEPTMENT dept on emp.deptId=dept.id;
select emp.name as Ename, emp.id as EId, dept.name as DeptId from EMPLOYEE emp   join DEPTMENT dept on emp.deptId=dept.id;

-- Right Outer Join or Right Join
-- get the all the data form the right table and take only data which are the matched form right table on the besed on the "NO" condition. 
select * from 	EMPLOYEE emp right outer join DEPTMENT dept on emp.deptId=dept.id;
select * from 	EMPLOYEE emp right  join DEPTMENT dept on emp.deptId=dept.id;

-- Left Outer Join or Left Join
-- thare all the data form left table and combile the data with which are matched with left rows besed on the "ON" condition.
select * from EMPLOYEE emp left outer join DEPTMENT dept on emp.deptId=dept.id;
select * from EMPLOYEE emp left  join DEPTMENT dept on emp.deptId=dept.id;

-- full outer Join
-- tekae take all the data form left and right in which are matched or not both take based on the "NO" condition  
-- mysql not support the full keywork but sql support full keywork so we need to use diffrent way to get the full outer join in mysql  
-- we can use the union in mysql of left and right outer join in my sql

select * from EMPLOYEE emp left Outer Join DEPTMENT dept  on emp.deptId=dept.id
UNION
select * from EMPLOYEE emp Right Outer Join DEPTMENT dept  on emp.deptId=dept.id;

-- self Join 
-- this join is the work with the same take but and gte the rows which are the same bases on the condition 
select * from EMPLOYEE emp1 ,EMPLOYEE emp2 where emp1.deptId=emp2.deptId and emp1.id<>emp2.id;

-- Cross Join
-- it will maping each the row with every roes will second table.
select * from EMPLOYEE cross Join DEPTMENT;
select * from EMPLOYEE , DEPTMENT;
select * from EMPLOYEE emp cross Join DEPTMENT dept;
select count(*) from EMPLOYEE cross Join DEPTMENT;






