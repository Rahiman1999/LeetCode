# Write your MySQL query statement below
select firstName, lastName, city, state from Person p left join Address A using(personId);

-- select p.firstName,p.lastName,A.city,A.state from Person p left join Address A on P.personId=A.personId;