# 😊😊spring-jwt🎈🎈

This is simple spring boot project and spring data jpa, postgresql,
spring security, and JWT with cookie. The purpose is to use JWT with cookie.


🎆🎇 Backend with Java, Spring boot, Spring data JPA, Hibernate,  Postgresql:

** open spring-jwt pom file in IntelliJ Idea.
** Modify application.properties
   - A database is created in PostgreSQL with the same name as in application.properties.
   - username and password for postgres database.
   - Encode a long string to base64 for JWT secret.
   - JWT Expiration  is in milliseconds.
     - cookie name
** Check "Enable annotation Processing" for Lombok. In IntelliJ Idea,
   it's file ->  setting -> compiler -> Annotation Processing.

   
 
** I am also using Postman  to test these endpoints:

1. baseURL: http://localhost:8080/api

2. login POST request endpoint: ${baseURL}/auth/login

   Then signin with POST request using following json format in json body

   {
   "username": "user2",
   "password": "user2password"
   }

3. signup POST request endpoint: ${baseURL}/auth/signup.
   Role is optional.
   Then signup with POST request with following json format in json body

   {
   "username": "user2",
   "email": "user2@example.com",
   "role": ["user"],
   "password": "user2password"
   }

4. admin GET request endpoint: ${baseURL}/auth/admin

5. GET request for userdetails: ${baseURL}/auth/user
6. POST request for logout: ${baseURL}/auth/logout with no json body


** role is optional and it is a set like ["user"], ["user", "admin"], or ["admin"]

😍😍 Front end with React ✔✔
** open react-demo folder in vs code.
** Do "npm install" and then "npm run dev"
** End point is http://localhost:5173
** signup, login, logout endpoints.
