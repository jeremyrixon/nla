# nla
Programming Exercise done for National Library Australia.
This application allows to view people registered with NLA and view the books they have borrowed.

# Assumptions
Following assumptions are made while building the project :-
1. A person can lend any number of books at a time
2. A book can be lent to one person at a time

# To start the application
1. Clone the repository
2. run mvn spring-boot:run (this will start embedded jetty server )
3. open http://localhost:8081

# Note
1. The application shows who is currently lending the book
2. The application does not show a history of people who have lent the book

# Technical 
1. In this application I've relied on Hibernate to create the schema.
It's not ideal in production environment to rely on hibernate to create the schema.
Use Flyway or Liquibase instead.

