# Lab 13/02/23 Spring RESTful API

### Task - Names
In this task I practiced building a Spring Boot app that contained a RESTful API which accepted requests to multiple routes.


- Created a controller which accepts requests made to `http://localhost:8080/greeting`. 
- Created a method which accepted a `GET` request and returned a string saying "Good afternoon <yourname>!", eg. `"Good afternoon Ramiro!"`
- Created a POJO to represent a greeting. It contained the following properties:
  - `name`
  - `timeOfDay`
- Refactored the controller to use my POJO instead of a string

I used [Spring Boot Initializr](https://start.spring.io/) to boot up this project quickly.
​
### Applications Used
> 
> - Project: Maven
> - Language: Java
> - Spring Boot Version: 3.0.2
> - Updated "artifact" in the meta-data to "task_01". 
> - Packaging: Jar
> - Java: 17
> 
> Dependencies:
> 
> - Spring Web
> - Spring Boot DevTools
>
