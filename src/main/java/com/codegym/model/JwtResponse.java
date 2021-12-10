package com.codegym.model;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

public class JwtResponse {
    private Long id;
    private String token;
    private String type = "Bearer";
    private String username;
    private String name;
    private Collection<? extends GrantedAuthority> roles;

    public JwtResponse(Long id, String token, String type, String username, String name, Collection<? extends GrantedAuthority> roles) {
        this.id = id;
        this.token = token;
        this.type = type;
        this.username = username;
        this.name = name;
        this.roles = roles;
    }

    public JwtResponse(String token, Long id, String type, String username, Collection<? extends GrantedAuthority> roles) {
        this.id = id;
        this.token = token;
        this.type = type;
        this.username = username;
        this.roles = roles;
    }

    public JwtResponse(String token, String type, String username, Collection<? extends GrantedAuthority> roles) {
        this.token = token;
        this.type = type;
        this.username = username;
        this.roles = roles;
    }
//
//    public JwtResponse(String accessToken, Long id, String username, String name, Collection<? extends GrantedAuthority> roles) {
//        this.token = accessToken;
//        this.username = username;
//        this.roles = roles;
//        this.name = name;
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccessToken() {
        return token;
    }

    public void setAccessToken(String accessToken) {
        this.token = accessToken;
    }

    public String getTokenType() {
        return type;
    }

    public void setTokenType(String tokenType) {
        this.type = tokenType;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Collection<? extends GrantedAuthority> getRoles() {
        return roles;
    }
}
