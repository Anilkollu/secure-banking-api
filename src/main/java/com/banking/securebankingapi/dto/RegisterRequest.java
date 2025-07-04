package com.banking.securebankingapi.dto;


import com.banking.securebankingapi.model.Role;
import lombok.Data;

import java.util.Set;

@Data
public class RegisterRequest {
    private String username;
    public void setUsername(String username) {
        this.username = username;
    }
    public String getUsername() {
        return username;
    }


    private String password;
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return password;
    }

    private String email;
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    private Set<Role> roles;
    public Set<Role> getRoles() {
        return roles;
    }
    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}

