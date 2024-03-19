# Write your MySQL query statement below

select E.name as Employee from Employee E join Employee M on E.managerId=M.id And E.salary>M.salary;
