package com.ramesh.spring.jwt.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class HelloController {

    @PreAuthorize("hasRole('ROLE_USER')")
    @GetMapping("/user")
    public String user(){
        return "This message is for user only.";
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @GetMapping("/admin")
    public String admin(){
        return "This message is for admin only";
    }

}
