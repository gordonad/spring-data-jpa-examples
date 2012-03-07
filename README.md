# Spring Data JPA Examples #



## Project Modules ##

---

### top level (parent) ###
Maven configuration with dependency management for Plugins and Dependencies.  Dependency Management section controls
the overarching versions.  This is significant when using Spring projects such as Spring Data that have dependencies on
the core Spring framework, guaranteeing all versions of Spring dependencies are the same.  This is also significant for
SLF4J where versions 1.5.x and 1.6.x clash.

---

### spring-data-jpa-example ###
This project demonstrates
Hibernate


---

### spring-data-jpa-showcase ###
This is the sample app to demo Spring Data JPA features at conferences.

The two main packages to take a look at are `org.springframework.data.jpa.showcase.before` and `org.springframework.data.jpa.showcase.after`. The first one shows a typical data access implementation with JPA 2. The second one shows what's left if you use Spring Data JPA.

OpenJPA



