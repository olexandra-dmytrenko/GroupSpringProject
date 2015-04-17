package com.models;

import org.hibernate.validator.constraints.NotEmpty;

public class User {

    @NotEmpty(message = "Name is mandatory")
    private String name;
    @NotEmpty(message = "Password is mandatory")
    private String password;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
