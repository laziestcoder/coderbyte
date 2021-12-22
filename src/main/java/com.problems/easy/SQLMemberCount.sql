/* write your SQL query below */
/*

SQL Member Count
Your table: maintable_FMGSK

MySQL version: 5.5.56-log

In this MySQL challenge, your query should return the names of the people who are reported to
(excluding null values), the number of members that report to them, and the average age of those members as an integer.
The rows should be ordered by the names in alphabetical order. Your output should look like the following table.



*/
SELECT DISTINCT(ReportsTo),
               COUNT(ReportsTo) as Members,
               CEILING(Avg(Age)) as 'Average Age'
FROM maintable_FMGSK
GROUP BY ReportsTo
HAVING ReportsTo IS NOT NULL
