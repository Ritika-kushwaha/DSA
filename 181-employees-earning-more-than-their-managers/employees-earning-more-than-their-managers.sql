# Write your MySQL query statement below
SELECT e1.name AS Employee
FROM Employee AS e1, Employee AS e2
WHERE e1.managerId = e2.id 
  AND e1.salary > e2.salary;