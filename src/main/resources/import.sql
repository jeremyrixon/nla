-- hibernate creates columns in alphabetical order contactNo., email, firstN, lastN
INSERT INTO person VALUES (1, '0407681729', 'vj@jais.org', 'Vandana', 'Jaiswal' );
INSERT INTO person VALUES (2, '123456789', 'bill@jais.org', 'Bill', 'Shorten');

INSERT INTO book VALUES (1,'M, Scott','0785342633719', 'Adventures of La La Island',0);
INSERT INTO book VALUES (2,'Jen, Clive','9780006178040', 'Jamaica', 0);

INSERT INTO person_books VALUES (1,1);
INSERT INTO person_books VALUES (1,2);