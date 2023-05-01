package com.example.login_application;

import com.example.login_application.controllers.LoginController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 700, 500);
        stage.setTitle("Login Page");
        stage.setScene(scene);
        stage.show();

        //      Create reference to mainStage from LoginController
        LoginController loginController = fxmlLoader.getController();
        loginController.setStage(stage);

    }

    public static void main(String[] args) {

        launch();

    }
}