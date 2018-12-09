# nla
Programming Exercise done for National Library Australia.
This application allows one to view people registered with the NLA and view the books they have borrowed.

# Assumptions
The following assumptions have been made while building the project :-
1. A person can borrow any number of books at a time
2. A book can be lent to one person at a time

# To start the application
1. Clone the repository
2. run mvn spring-boot:run (this will start the embedded jetty server )
3. open http://localhost:8081

# Note
1. The application shows who is currently borrowing the book
2. The application does not show a history of people who have borrowed the book

# Technical 
1. In this application I've relied on Hibernate to create the schema.
It's not ideal in production environment to rely on hibernate to create the schema.
Use Flyway or Liquibase instead.

