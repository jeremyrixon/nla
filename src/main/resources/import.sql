-- hibernate creates columns in alphabetical order contactNo., email, firstN, lastN
INSERT INTO person VALUES (1, '0407681729', 'vj@jais.org', 'Vandana', 'Jaiswal' );
INSERT INTO person VALUES (2, '053456789', 'nancy@jais.org', 'Nancy', 'Drew');
INSERT INTO person VALUES (3, '0903456789', 'james@jais.org', 'James', 'Bur');
INSERT INTO person VALUES (4, '568456789', 'peter@jais.org', 'Peter', 'McManis');
INSERT INTO person VALUES (5, '89123456789', 'jack@jais.org', 'Jack', 'Reacher');
INSERT INTO person VALUES (6, '1000056789', 'simran@jais.org', 'Simran', 'Saxena');
INSERT INTO person VALUES (7, '8909006789', 'nikhil@jais.org', 'Nikhil', 'Kohl');

INSERT INTO book VALUES (1,'Scott M','0785342633719', 'Adventures of La La Island',0);
INSERT INTO book VALUES (2,'Clive Jen','9780006178040', 'Jamaica', 0);
INSERT INTO book VALUES (3,'Marijn Haverbeke','9781593275846', 'Eloquent JavaScript, Second Edition', 0);
INSERT INTO book VALUES (4,'Addy Osmani','9781449331818', 'Learning JavaScript Design Patterns', 0);
INSERT INTO book VALUES (5,'Axel Rauschmayer','9781449365035', 'Speaking JavaScript', 0);
INSERT INTO book VALUES (6,'Richard Bach','9780006490340', 'Jonathan Livingston Seagull', 0);
INSERT INTO book VALUES (7,'Eric Elliott','9781491950296', 'Programming JavaScript Applications', 0);
INSERT INTO book VALUES (8,'Nicholas C. Zakas','9781593277574', 'Understanding ECMAScript 6', 0);
INSERT INTO book VALUES (9,'Kyle Simpson','9781491904244', 'You Don''t Know JS', 0);
INSERT INTO book VALUES (10,'Richard E. Silverman','9781449325862', 'Git Pocket Guide', 0);
INSERT INTO book VALUES (11,'Glenn Block, et al.','9781449337711', 'Designing Evolvable Web APIs with ASP.NET', 0);

INSERT INTO person_books VALUES (1,1);
INSERT INTO person_books VALUES (1,2);

INSERT INTO person_books VALUES (3,11);
INSERT INTO person_books VALUES (3,10);
INSERT INTO person_books VALUES (3,9);
INSERT INTO person_books VALUES (3,8);
INSERT INTO person_books VALUES (3,7);

INSERT INTO person_books VALUES (4,3);
INSERT INTO person_books VALUES (5,4);
INSERT INTO person_books VALUES (6,5);
INSERT INTO person_books VALUES (7,6);

