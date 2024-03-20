# Write your MySQL query statement below

-- select W.id from Weather W join Weather W2 on DATEDIFF(day,W.recordDate,W2.recordDate)=1 Where W2.temperature<W.temperature;
SELECT w2.id
FROM Weather w1
join Weather w2
ON DATEDIFF (w1.recordDate ,w2.recordDate ) = -1
AND w2.temperature>w1.temperature  