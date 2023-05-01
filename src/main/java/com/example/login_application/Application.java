package com.example.login_application;

import com.example.login_application.controllers.LoginController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
//       Start the application by opening the login.fxml file
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 700, 500);
        stage.setTitle("Login Page");
        stage.setScene(scene);
        stage.show();

        //      Pass reference to mainStage to LoginController from this file
        LoginController loginController = fxmlLoader.getController();
        loginController.setStage(stage);

    }

    public static void main(String[] args) {

        launch();

    }
}