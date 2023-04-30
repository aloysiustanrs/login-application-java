package com.example.login_application;

import java.util.ArrayList;
import java.util.HashMap;

public class User {
    private String username;
    private String password;
    private boolean isManager;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isManager() {
        return isManager;
    }

    public void setManager(boolean isManager) {
        this.isManager = isManager;
    }



    // Constructor, getters, and setters
}
