# "java-usual-store" (backend of web app)

## Description:

Platform for buying and locating products.

## Functionalities

* Admin is able to:
  - add/change information about products;
  - accomplish moderation process of adding product on store
  - watch users information;
  - top up users balance
  - suspend/delete user account
  - send notifications to users
  - reconcile applies of company for registration on platform
  - suspend/delete user companies

* User is able to:
  - buy/return products
  - remain comments and give grade of bought products
  - check own product history
  - check own notifications
  - apply to registration companies on platform

* User who became an entrepreneur is able to:
  - sell own products after passed moderation process
  - get income for minus commission

## Schema of database

![BD_Schema](https://github.com/AlexKlinkov/java-usual-store/blob/develop/DB_SCHEMA.jpg)

## Technology stack (on that moment):
 - Java 17
 - Spring Boot 2.7.9
 - Spring Security 5.7.7
 - Maven 4.0.0
 - ORM Hibernate 5.6.15.Final
 - PostgreSQL 42.3.1
 - Lombok 1.18.24

## TO DO
- finish writing base functionalities described above
- cover code by tests, achieve 80% of covering
- create postman queries for trial app
- prepare documentation for services class
- create usual convenient frontend represent to interact app (html pages)
- create files docker and docker-compose for deploy app
- write instruction for launch this app
