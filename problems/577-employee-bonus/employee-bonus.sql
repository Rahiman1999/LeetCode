# Write your MySQL query statement below

select name, bonus from Employee E left join Bonus B using (empId) where B.bonus < 1000 or Bonus is null;