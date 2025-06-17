package com.ramesh.spring.jwt.security.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Set;

@Data

public class SignupRequest {
    @NotBlank
    @Size(min=3, max=20)
    private String username;
    @NotBlank
    @Email
    private String email;
    private Set<String> role;
    @NotBlank
    @Size(min=4, max = 40)
    private String password;
}
