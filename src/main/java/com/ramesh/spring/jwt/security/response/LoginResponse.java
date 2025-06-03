package com.ramesh.spring.jwt.security.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class LoginResponse {
    private Long id;
    private String jwtToken;
    private String username;
    private List<String> roles;

}
