package com.ramesh.spring.jwt.security.response;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor

@Getter
@Setter
public class LoginResponse {
    private Long id;
    private String jwtCookie;
    private String username;
    private List<String> roles;

    public LoginResponse(Long id, String username, List<String> roles) {
        this.id = id;
        this.username = username;
        this.roles = roles;
    }
}
