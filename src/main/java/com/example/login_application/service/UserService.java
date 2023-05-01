package com.example.login_application.service;

import com.example.login_application.model.User;
import com.example.login_application.repository.UserRepository;

import java.util.ArrayList;

public class UserService {

    private UserRepository repo;

    public UserService(){
        repo = new UserRepository();

    }

    public ArrayList<Boolean> loginSuccessAndIsManagerCheck(String username, String password){
//        Return [ login successful? , is Manager ? ]
        ArrayList<Boolean> set = new ArrayList<>();
        User currUser = repo.getUserByUsername(username);

//        add login successful or not at index 0 of set
        if (currUser != null && currUser.getPassword().equals(password)){
            set.add(true);
        }
        else{
            set.add(false);
        }

//        add manager or not at index 1 of set
        if (currUser!= null && currUser.isManager()){
            set.add(true);
        }
        else{
            set.add(false);
        }

        return set;
    }

}