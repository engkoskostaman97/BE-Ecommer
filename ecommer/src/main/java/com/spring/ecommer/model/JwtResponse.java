package com.spring.ecommer.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class JwtResponse implements Serializable {
    private String token;
    private String type = "Bearer";
    private String username;
    private String email;
    private String roles;

    public JwtResponse(
            String accessToken,
            String username,
            String email,
            String roles) {
        this.username = username;
        this.email = email;
        this.token = accessToken;
        this.roles= roles;
    }

}