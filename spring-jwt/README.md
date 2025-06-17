# 😊😊spring-jwt🎈🎈

This is simple spring boot project and spring data jpa, postgresql,
spring security, and JWT with cookie. The purpose is to use JWT with cookie.

I have used .env file to save most secrets and load it through
bash file(.sh file) and create corresponding constants in
application.properties. I am running ./ run.sh file to start maven.
The empty database is created in postgreSQL before running.
I am using Postman for now to test
these endpoints:

1. baseURL: http://localhost:8080/api

2. signin POST request endpoint: ${baseURL}/auth/signin.

   Then signin with POST request using following json format in json body

   {
   "username": "user2",
   "password": "user2password"
   }

3. signup POST request endpoint: ${baseURL}/auth/signup.

   Then signup with POST request with following json format in json body

   {
   "username": "user2",
   "email": "user2@example.com",
   "role": ["user"],
   "password": "user2password"
   }

4. admin GET request endpoint: ${baseURL}/admin
5. user GET request endpoint: ${baseURL}/user
6. GET request for userdetails: ${baseURL}/auth/user
7. POST request for logout: ${baseURL}/auth/signout with no json body

When signed in, it gives cookie in response in postman,

role is set like ["user"], ["user", "admin"], or ["admin"]
