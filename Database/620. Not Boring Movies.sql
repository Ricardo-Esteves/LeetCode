SELECT *
FROM cinema
WHERE mod(id, 2) = 1 and description != 'boring'
order by rating DESC ;