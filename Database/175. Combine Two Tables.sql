SELECT FirstName, LastName, City, State
FROM Person p
left join Address a
on p.PersonId = a.PersonId;