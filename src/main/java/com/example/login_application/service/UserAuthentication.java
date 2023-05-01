package com.example.login_application.service;

import com.example.login_application.model.User;
import com.example.login_application.repository.UserRepository;

import java.util.ArrayList;

public class UserAuthentication {

    private UserRepository repo;

    public UserAuthentication(){
        repo = new UserRepository();

    }

    public ArrayList<Boolean> loginAuthentication(String username, String password){
//        Return [ login successful? , is Manager ? ]
        ArrayList<Boolean> list = new ArrayList<>();
        User currUser = repo.getUserByUsername(username);

//        add login successful or not at index 0 of set
        if (currUser != null && currUser.getPassword().equals(password)){
            list.add(true);
        }
        else{
            list.add(false);
        }

//        add manager or not at index 1 of set
        if (currUser!= null && currUser.isManager()){
            list.add(true);
        }
        else{
            list.add(false);
        }

        return list;
    }

}
