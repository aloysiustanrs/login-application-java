package com.example.login_application.controllers;

import com.example.login_application.model.User;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


import static com.example.login_application.controllers.LoginController.mainStage;

public class ManagerPageController implements Initializable {

    @FXML
    private Label manager_name;
    @FXML
    private Label manager_username;

//    Load name and username to page

    @FXML
    protected void loadUserData() {
        manager_username.setText(currUser.getUsername());
        manager_name.setText(currUser.getName());
    }

    private User currUser = LoginController.currUser;



    public void logout() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/example/login_application/login.fxml"));
        Scene scene = new Scene(root, 700, 500);


        mainStage.setScene(scene);
        mainStage.show();
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        loadUserData();
    }
}
